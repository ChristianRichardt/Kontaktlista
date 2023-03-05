fun main()
{
    val fileSystem = File()
    val telefonbok = fileSystem.readFiles()

    if(telefonbok != null){
        while(true){
            println("[1] Vissa alla kontakter")
            println("[2] Lägg till en kontakt")
            println("[3] Ta bort en kontakt")
            println("[4] Ändra en kontakts information \n")
            println("[0] Stäng programmet")

            val choice = readln().toInt()

            if(choice == 1){
                telefonbok.displayAllContacts()
                readln()
                continue
            }
            else if(choice == 2){
                telefonbok.createKontaktObject()
                readln()
                continue
            }
            else if(choice == 3){
                telefonbok.deleteAContact()
                readln()
                continue
            }
            else if(choice == 4){
                telefonbok.editAContact()
                readln()
                continue
            }
            else if(choice == 0){
                break
            }
        }
    }


}
