package com.chrissen.kotlinstudy.chapter4

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/6.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

interface JSONFactory<T> {

    fun fromJSON(jsonText: String): T

}