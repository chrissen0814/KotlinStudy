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

fun getShippingCostCalculator(delivery: Delivery) : (Order) -> Double{
    if(delivery == Delivery.EXPEDITED){
        return {order -> 6+ 2.1*order.itemCount }
    }
    return {order -> 1.2*order.itemCount }
}


//使用扩展函数，但还不够开放
fun List<SiteVisit>.averageDurationFor(os : OS) = filter { it.os == os }
        .map { it.duration }
        .average()
//使用高阶函数来增强它的扩展性（把条件下放给调用者）
fun List<SiteVisit>.getAverageDuration(predicate : (SiteVisit) -> Boolean) =
        filter(predicate).map(SiteVisit::duration).average()