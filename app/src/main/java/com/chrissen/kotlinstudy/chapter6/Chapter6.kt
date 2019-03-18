package com.chrissen.kotlinstudy.chapter6

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/14.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

fun main(args : Array<String>){
//    val string: String? = null
//    val address = Address("Elsestr.47", 80667, "Munich", "Genrmay")
//    val jetbrans = Company("JetBransi", address)
//    val person = Person("Dmitry", jetbrans)
//    printShippingLabel(person)
//    printShippingLabel(Person("Chris", null))
    val email: String? = "yourself@example.com"

    email.isNullOrBlank()
    email?.isBlank()
    email?.let { sendToEmail(it) }
}

fun sendToEmail(email: String){
    println("Sending email to $email")
}

fun strLenSafe(s : String?): Int{
    return if (s != null) s.length else 0
}

fun foo(s: String?){
    val t: String = s ?: ""
}

fun printShippingLabel(person: Person){
    val address = person.company?.address
    ?: throw IllegalArgumentException("No Address")
    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}