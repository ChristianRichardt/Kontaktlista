class Contactlist {
    public val contacts = ArrayList<ArrayList<String>>()

    public fun addContact(name:String, lastname:String, number:String){
        val contact = ArrayList<String>()
        contact.add(name)
        contact.add(lastname)
        contact.add(number)
        contacts.add(contact)
    }
}