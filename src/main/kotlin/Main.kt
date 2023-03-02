//import kotlin.contracts.contract

fun main() {
    val myContactlist = Contactlist()
    myContactlist.addContact("Agnes", "Stendahl", "0760099014")
    myContactlist.addContact(name = "Ebba", lastname = "Stendahl", number = "123456789")
    myContactlist.addContact(name = "Axel", lastname = "Stendahl", number = "456789")

    myContactlist.printContactlist()

    //myContactlist.removeContact(name = "Ebba", lastname = "Stendahl", number = "123456789")

    myContactlist.printContactlist()

    //myContactlist.changeContact(name = "Axel", lastname = "Stendahl", number = "456789", newname = "Jenny", newlastname = "Bengtsson", newnumber = "12345")

    myContactlist.printContactlist()
    myContactlist.printContactListInOrder()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}