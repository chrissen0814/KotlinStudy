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
//类型参数是一个判断式的函数，若为true则执行
fun String.filter(predicate : (Char) -> Boolean) : String{
    val sb = StringBuilder()
    for(index in 0 until length){
        val element = get(index)
        if(predicate(element)) sb.append(element)
    }
    return sb.toString()
}