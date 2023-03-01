class Contact(fName: String, lName: String, pNum: String, mail: String) {
    var firstName = fName
    var lastName = lName
    var phoneNumber = pNum
    var eMail = mail

    override fun toString(): String {
        return (firstName + " " + lastName + " " + phoneNumber + " " + eMail)
    }
}