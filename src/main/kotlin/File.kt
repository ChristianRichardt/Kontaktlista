import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.nio.file.StandardOpenOption


class File {
    fun writeFiles(telefonbok: Telefonbok) {

        val currentDirectory = File(".").absoluteFile

        val folderName = "Telefonbok"
        val folder = File(folderName)

        if (!folder.exists())
        {
            val created = folder.mkdir()
        }

        var i = 0



        // Loopar igenom antal directories som finns i foldern "Telefonbok".
        while (i < listOf(telefonbok).size) {
            var primeKey = folder.listFiles().size // Primärnyckel

            val child = "Telefonbok\\$primeKey.txt" // Skaffar sista delen av directories för första kontakten
            val newFile = File(currentDirectory, child) // Kombinera sistan delan och den origenalla directoryn

            val kontakt = telefonbok.listKontakt[i].firstName + ", " + telefonbok.listKontakt[i].lastName + ", " + telefonbok.listKontakt[i].number + ", " + telefonbok.listKontakt[i].email // Skapar string med all kontakt information
            newFile.writeText(kontakt) // Skriver in kontakten med fil namnet samma som nuvarande indexen

            i++
        }


    }

    fun readFiles(): Telefonbok?
    {


        val currentDirectory = File("").absoluteFile

        val folderName = "Telefonbok"
        val folder = File(currentDirectory, folderName)
        var numDirectories = folder.listFiles().size // Skaffar antal kontakter som finns i telefonboken

        var i = 0



        val listKontakt = mutableListOf<Kontakt>()

        // Loopar igenom med antal directories i teleonfoboken som finns
        while (i < numDirectories)
        {
            val child = "Telefonbok\\" + i.toString() + ".txt" // Skaffar sista delen av directoryn
            val newFile = File(currentDirectory, child) // Kombinerar de två

            val text = newFile.readText() // Läser filen

            val myArray = text.split(", ") // Splitar den långa stringen från filen vid varje komma och mellanslag som är ihop

            val kontakt = Kontakt(myArray[0], myArray[1], myArray[2], myArray[3]) // Skapar kontakt objekt

            listKontakt.add(kontakt) // Lägger till kontakt objektet till en lista av kontakter

            i++
        }

        val telefonBok = Telefonbok(listKontakt) // Skapar en telefonbok av listan av kontakter

        return telefonBok;
    }
}





