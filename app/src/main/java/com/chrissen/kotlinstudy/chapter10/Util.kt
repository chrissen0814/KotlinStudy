@file:JvmName("Chapter10")
package com.chrissen.kotlinstudy.chapter10

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/4/11.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

@Deprecated("Use removeAt(index) instead.", replaceWith = ReplaceWith("removeAt(index)"))
fun remove(index : Int){
    println("$index is removed.")
}

fun removeAt(index : Int){
    println("$index is removed!")
}

fun test(list : List<*>){

    @Suppress("UNCHECKED_CAST")
    val strings = list as List<String>
}

fun sum(x : Int, y : Int) : Int = x + y

//fun StringBuilder.serializeObject(obj: Any): String{
//    obj.javaClass.kotlin.memberProperties
//            .filter { it.findAnnotation<JsonExclude>() == null }
//            .joinToStringBuilder(this, prefix = "{", postfix = "}"){
//                serializeProperty(it, obj)
//            }
//}
//
//fun StringBuilder.serializeProperty(prop: KProperty1<Any, *>, obj: Any){
//    val jsonNameAnn = prop.findAnnotation<JsonName>()
//    val propName = jsonNameAnn?.name ?: prop.name
//
//}

