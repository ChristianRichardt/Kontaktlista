class ContactList {
    private val list = ArrayList<Contact>()
    private val fileManager = FileManager()

    fun PrintContacts(){
        var i: Int = 0
        val sortedContactList = list.sortedBy { it.firstName?.toString() }

        for(contact in sortedContactList){
            println(i.toString() + ":" + contact)
            i += 1
        }
    }
    fun AddContact(fName: String, lName: String, pNum: String, mail: String){
        val con = Contact(fName, lName, pNum, mail)
        list.add(con)
        fileManager.WriteContactToFile(con)
    }
    fun RemoveContact(index: Int){
        list.removeAt(index)
        println("The Contact has been removed")
    }
    fun UpdateContactInformation(index: Int, fName: String, lName: String, pNum: String, mail: String){
        val con = Contact(fName, lName, pNum, mail)
        list.removeAt(index)
        list.add((index), con)
        println("Contact information has been updated")
    }
}