package com.chrissen.kotlinstudy.chapter5

import java.io.File

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/11.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

data class Person(val name: String, val age: Int)

fun Person.isAdult() = age >= 21

fun File.isInsideHiddenDirectory() = generateSequence(this){it.parentFile}.any { it.isHidden }