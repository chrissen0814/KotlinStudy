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
//扩展属性
val <T> List<T>.penultimate : T
get() = this[size -2]

//设置泛型的上界约束
fun <T : Comparable<T>> max(first : T, second : T) : T{
    return if(first > second) first else second
}

//给类型参数指定多个约束
fun <T> ensureTrailingPeriod(seq : T)
where T : CharSequence, T : Appendable{
    if(seq.endsWith(".").not()){
        seq.append(".")
    }
}

//泛型类型参数检查的时候不能使用is,但可以使用as, as?
fun printSum(c : Collection<*>){
    val intList = c as? List<Int> ?: throw IllegalArgumentException("Error")
    println(intList.sum())
}