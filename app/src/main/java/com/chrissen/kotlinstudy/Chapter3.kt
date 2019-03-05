package com.chrissen.kotlinstudy

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/2/28.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

//等价于常量public static final
const val UNIX_LINE_SEPARATOR = "\n"

fun main(args : Array<String>){
    val set = hashSetOf(1, 7, 35)
    val list = arrayListOf(1, 7, 25)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    val array = arrayOf("Ok", "No")

    val (number, name) = 1 to "one"

    val list1 = listOf("args:", *array)
    println(list1)

    println("12.345-5.A".split(".", "-"))

    //kotlin的javaClass等于Java的getClass()
//    println(set.javaClass)
//    println(list.javaClass)
//    println(map.javaClass)
//    println(list.last().toString()) //last() 列表的最后一个元素
//    println(set.max().toString()) //数字列表的最大值
//    println(set.min().toString()) //数字列表的最小值
//    println(list.min().toString())

//    //可以显式地表明一些参数名称,显式声明后的所有参数都必须显式地声明
//    println(list.joinToString(separator = ";", prefix = "(", postfix = ")"))
//    //由于函数的后三个参数有默认值，在调用时可以省略掉
//    println(set.joinToString())
//    //扩展函数（String是接收者类型， "Kotlin"就是接收者对象）
//    println("Kotlin".lastChar())

    class User(val id : Int, val name: String, val address : String)

}

