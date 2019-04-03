package com.chrissen.kotlinstudy.chapter9

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/4/3.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

fun main(args: Array<String>){
    val authors = mutableListOf<String>()
    val readers : MutableList<String> = mutableListOf()

    readers.filter { it !in authors }
}