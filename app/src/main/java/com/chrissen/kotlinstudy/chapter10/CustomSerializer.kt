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

annotation class CustomSerializer(val serializeClass : KClass<out ValueSerializer<*>>) {
}