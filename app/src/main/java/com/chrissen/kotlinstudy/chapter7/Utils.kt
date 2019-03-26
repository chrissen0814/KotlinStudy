package com.chrissen.kotlinstudy.chapter7

import java.math.BigDecimal

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/21.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */
//声明为扩展函数的重载函数
operator fun Point.plus(other : Point) : Point{
    return Point(this.x + other.x, this.y + other.y)
}

//通过扩展函数重载BigDecimal的inc()函数
operator fun BigDecimal.inc() = this + BigDecimal.ONE

//operator fun Point.get(index : Int) : Int{
//    return when(index){
//        0 -> x
//        1 -> y
//        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
//    }
//}

fun printEntries(map : Map<String, String>){
    for((key, value) in map){
        println("$key -> $value")
    }
}