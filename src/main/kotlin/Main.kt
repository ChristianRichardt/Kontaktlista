import kotlin.contracts.contract

fun main(args: Array<String>) {
    println("Hello World!")

    val myContactlist = Contactlist()
    myContactlist.addContact("Agnes", "Stendahl", "0760099014")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}