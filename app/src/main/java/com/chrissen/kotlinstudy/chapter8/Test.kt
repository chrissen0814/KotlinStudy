package com.chrissen.kotlinstudy.chapter8

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/31.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

fun main(args : Array<String>){

    //把lambda表达式保存在局部变量中
    val sum = {x : Int, y : Int -> x + y}
    //下面的代码是编译器推导出的
    val sumFull : (Int, Int) -> Int = {x , y -> x + y}
    //函数类型的返回值可以为空
    val canReturnNull : (Int, Int) -> Int? = {x, y -> null}
    //函数变量本身可以为空
    val funOrNull : ((Int, Int) -> Int)? = null

    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")

    val log = listOf(SiteVisit("/", 34.0, OS.WINDOWS),
            SiteVisit("/", 22.0, OS.MAC),
            SiteVisit("/", 12.0, OS.WINDOWS),
            SiteVisit("/", 8.0, OS.IOS),
            SiteVisit("/", 16.3, OS.ANDROID))

    val averageWindowsDuration = log.filter { it.os in setOf(OS.ANDROID, OS.IOS) }
            .map { it.duration }.average()
    println(averageWindowsDuration)

    println(log.getAverageDuration { it.os in setOf(OS.IOS, OS.ANDROID) })

}