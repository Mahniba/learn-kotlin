fun contactList() {
    var contact = mutableMapOf(672544142 to "Mah", 679298574 to "tata", 673394567 to "steve")
    contact.forEach{ key, value ->
        println("$key -> $value")
    }
  contact.put(675984321 , "Leo")
    println(contact)
}