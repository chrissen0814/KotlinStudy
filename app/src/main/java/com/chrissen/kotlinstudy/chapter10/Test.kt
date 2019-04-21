package com.chrissen.kotlinstudy.chapter10

import kotlin.reflect.full.memberProperties

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/4/11.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

fun main(args : Array<String>){
    val person = Person("Alice", 28)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
    val memberProperty = Person::age
    println(memberProperty.get(person))

    val kFunction = ::sum
    println(kFunction.call(1, 2) + kFunction.invoke(3, 4))


}