import com.sun.jdi.IntegerValue

fun main(args: Array<String>) {
    val cList = ContactList()
    var choice: Int = 0

    while(true){
        println("[1]: Lägg till en ny kontakt")
        println("[2]: Redigera en kontakts information")
        println("[3]: Ta bort en kontakt")
        println("[4]: Skriv ut alla kontakter \n")
        println("[0]: Stäng programmet")

        choice = readln().toInt()

        if(choice == 1){
            val fName: String = readln()
            val lName: String = readln()
            val pNum: String = readln()
            val mail: String = readln()

            cList.AddContact(fName, lName, pNum, mail)

            readln()
            continue
        }
        else if(choice == 2){
            cList.PrintContacts()

            val index: Int = readln().toInt()
            val fName: String = readln()
            val lName: String = readln()
            val pNum: String = readln()
            val mail: String = readln()

            cList.UpdateContactInformation(index, fName, lName, pNum, mail)

            readln()
            continue
        }
        else if(choice == 3){
            cList.PrintContacts()
            val index: Int = readln().toInt()
            cList.RemoveContact(index)

            readln()
            continue
        }
        else if(choice == 4){
            cList.PrintContacts()
            readln()
            continue
        }
        else if(choice == 0){
            break;
        }
    }
}