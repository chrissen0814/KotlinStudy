package com.chrissen.kotlinstudy.chapter10

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/4/16.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

interface ValueSerializer<T> {

    fun toJsonValue(t : T) : Any?

    fun fromJsonValue(jsonValue : Any?) :T

}