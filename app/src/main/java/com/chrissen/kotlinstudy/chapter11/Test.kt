package com.chrissen.kotlinstudy.chapter11

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/5/6.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

fun main(args: Array<String>){

    //带接收者的lambda
    val s = buildString {
        append("Hello, ")
        append("World!")
    }
    println(s)

    //invoke约定
    val chris = Greetor("Chris")
    chris("Hi")
}