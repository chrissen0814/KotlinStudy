@file:JvmName("StringFunctions")
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

/**
 * 可以给函数的参数设置默认值，有默认值的参数在调用时可以省略掉
 * @JvmOverloads 指示编译器生成该函数的所有重载函数,便于java调用
 */
fun <T> Collection<T>.joinToString(separator : String = ",", prefix: String = "", postfix: String = "") : String{
    val result = StringBuilder()
    result.append(prefix)
    for((index, element) in this.withIndex()){
        if(index > 0){
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

//顶层函数和顶层属性，放在文件的顶层的函数和属性（以.kt为后缀的文件）


//扩展函数，在函数名的前面加上要扩展的类或接口的名称
//String为接收者类型， this为接收者的对象（该类的一个实例）
//扩展函数中可以直接访问被扩展的类的方法和属性
//扩展函数是静态函数,不能被之类重写
fun String.lastChar() : Char = this.get(this.length - 1)

//Kotlin允许用和导入类一样的语法导入单个函数
//可以用as关键字来修改导入的类或者函数名称（避免函数重名的问题）


//扩展属性，可以没有任何字段，无法添加额外的字段（也就是说没有支持字段来保存值，需要重写get()方法或set()方法，根据属性是val还是var来定）
val String.lastChar : Char
get() = get(length - 1)

var StringBuilder.lastChar : Char
get() = get(length - 1)
set(value : Char){
    this.setCharAt(length - 1, value)
}