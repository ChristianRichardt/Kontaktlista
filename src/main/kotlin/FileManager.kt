import java.io.File

class FileManager {
    val fileName = "KontaktLista.txt"
    val file = File(fileName)
    var isCreated = file.createNewFile()

    fun WriteContactToFile(con: Contact){
        file.appendText(con.toString() + "\n")
    }
    fun UpdateContactList(list: ArrayList<Contact>){
        file.writeText("")
        for(contact in list){
            file.appendText(contact.toString())
        }
    }
    fun PrintAllContactsFromFile(){
        for(contact in file.readLines()){
            println(contact)
        }
    }
}