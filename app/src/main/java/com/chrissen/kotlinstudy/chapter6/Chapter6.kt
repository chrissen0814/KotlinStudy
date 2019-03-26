package com.chrissen.kotlinstudy.chapter6

import java.io.BufferedReader

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

    arrayOf("a", "b")
    val letters = Array<String>(26){i -> ('a' + i).toString()}


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

//支持类型参数的可空性
fun readNumbers(reader: BufferedReader): List<Int?>{
    val result = ArrayList<Int?>()
    for(line in reader.lineSequence()){
        try {
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>){
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
}