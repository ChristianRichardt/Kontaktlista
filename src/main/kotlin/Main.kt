//import kotlin.contracts.contract

fun main()
{
    menu()
}

fun menu() {
    val fileSystem = File()
    val telefonbok = fileSystem.readFiles()

    if (telefonbok != null) {


        while (true) {
            println("\n------------------------------------------\n")
            println("[1] Lägg till kontakt")
            println("[2] Ta bort kontakt")
            println("[3] Redigera en kontakt")
            println("[4] Visa alla kontakter")
            println("\n------------------------------------------\n")
            val menuInput = readln()

            if (menuInput == "1") {
                telefonbok.createKontaktObject()
            } else if (menuInput == "2") {
                telefonbok.deleteAContact()
            } else if (menuInput == "3") {
                telefonbok.editAContact()
            } else if (menuInput == "4") {
                telefonbok.displayAllContacts()
            }

            println("\n------------------------------------------\n")

            readlnOrNull()

        }

    }
}

