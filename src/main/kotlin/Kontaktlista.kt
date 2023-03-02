class  Contactlist{
    //public val contacts = ArrayList<ArrayList<String>>()
    val contacts = ArrayList<Contact>()

    fun addContact(name: String, lastname: String, number: String) {
        //val contact = ArrayList<String>()
        //contact.add(name)
        //contact.add(lastname)
        //contact.add(number)
        //contacts.add(contact)

        val contact = Contact()
        contact.name=name
        contact.lastname=lastname
        contact.number=number
        contacts.add(contact)
    }

    fun removeContact(name: String, lastname: String, number: String) {
        //val contact = ArrayList<String>()
        //contact.add(name)
        //contact.add(lastname)
        //contact.add(number)
        //contacts.remove(contact)
        for (i in contacts){
            if (i.name == name && i.lastname == lastname && i.number == number){
                contacts.remove(i)
            }
        }
    }

    fun changeContact(
        name: String,
        lastname: String,
        number: String,
        newname: String,
        newlastname: String,
        newnumber: String
    ) {
        for (i in contacts){
            if (i.name == name && i.lastname == lastname && i.number == number){
                i.name=newname
                i.lastname=newlastname
                i.number=newnumber
            }
        }
    }

    fun printContactlist() {
        //for (i in contacts) {
            //println(i)
        //}
        for (k in contacts) {
            print(k.name + " ")
            print(k.lastname + " ")
            println(k.number)
        }
        println()
    }

    fun printContactListInOrder() {
        val sortedList = contacts.sortedWith(compareBy({ it.name }))
        for (i in sortedList) {
            print(i.name + " ")
            print(i.lastname + " ")
            println(i.number + " ")
        }
        println()
    }
}