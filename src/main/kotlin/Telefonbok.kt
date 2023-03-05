import java.nio.file.Files
import java.nio.file.Paths
import java.io.File as JFile

class Telefonbok (var listKontakt: List<Kontakt>){
    fun createKontaktObject()
    {
        val kontakt = Kontakt(inputFirstName(),inputLastName(),inputNumber(),inputEmail())

        val file = File()
        val listKontakt: List<Kontakt> = listOf(kontakt)
        val telefonbok = Telefonbok(listKontakt)

        file.writeFiles(telefonbok)
    }

    fun inputFirstName(): String?
    {
        println("Firstname: ")
        val firstName = readln()

        return firstName;
    }

    fun inputLastName(): String?
    {
        println("Lastname: ")
        val lastName = readln()

        return lastName;
    }

    fun inputNumber(): String?
    {
        println("Number: ")
        val number = readln();

        return number;
    }

    fun inputEmail(): String?
    {
        println("Email: ")
        val email = readln();

        return email;
    }

    fun displayAllContacts()
    {
        val fileSystem = File()
        val telefonbok = fileSystem.readFiles()

        val folderName = "Telefonbok"
        val folder = java.io.File(folderName)

        var i = 0

        if (telefonbok != null) {
            while (i < folder.listFiles().size) {
                println(
                    "[" + i + "]" +
                            telefonbok.listKontakt[i].firstName + " " +
                            telefonbok.listKontakt[i].lastName + " " +
                            telefonbok.listKontakt[i].number + " " +
                            telefonbok.listKontakt[i].email
                )

                i++
            }
        }
    }

    fun deleteAContact() {
        displayAllContacts()

        var contactId = readln()

        val directory = JFile("Telefonbok\\")
        val files = directory.listFiles { file -> file.name.contains(contactId + ".txt") }

        for (file in files) {
            JFile(file.absolutePath).delete()
        }

        renameRemainingContacts()
    }

    fun renameRemainingContacts() {
        val folderPath = "Telefonbok\\"
        val folder = JFile(folderPath)

        val files = folder.listFiles()

        for (file in files) {
            val currentName = file.nameWithoutExtension
            val currentNumber = currentName.toInt()
            val newName = (currentNumber - 1).toString() + "." + file.extension
            val newFile = JFile(folder, newName)
            file.renameTo(newFile)
        }
    }

    fun editAContact() {
        displayAllContacts()

        val fileSystem = File()
        val telefonbok = fileSystem.readFiles()

        val contactId = readln().toInt()

        if (telefonbok != null) {
            println("[1] " + telefonbok.listKontakt[contactId].firstName)
            println("[2] " + telefonbok.listKontakt[contactId].lastName)
            println("[3] " + telefonbok.listKontakt[contactId].number)
            println("[4] " + telefonbok.listKontakt[contactId].email)
        }

        val valueToEdit = readln().toInt()

        println("\nWhat do you want new value to be?")

        val newValue = readln()
        if (telefonbok != null) {


            if (valueToEdit == 1) {
                telefonbok.listKontakt[contactId].firstName = newValue
            }

            if (valueToEdit == 2) {
                telefonbok.listKontakt[contactId].lastName = newValue
            }

            if (valueToEdit == 3) {
                telefonbok.listKontakt[contactId].number = newValue
            }

            if (valueToEdit == 4) {
                telefonbok.listKontakt[contactId].email = newValue
            }
            fileSystem.writeFiles(telefonbok)
        }
    }
}