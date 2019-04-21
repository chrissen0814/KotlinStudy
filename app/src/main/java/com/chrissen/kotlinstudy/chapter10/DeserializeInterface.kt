package com.chrissen.kotlinstudy.chapter10

import kotlin.reflect.KClass

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/4/16.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */
//out关键字的作用：可以使用Any的子类
annotation class DeserializeInterface(val targetClass : KClass<out Any>) {
}