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
}