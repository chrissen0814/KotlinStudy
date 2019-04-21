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
@Target(AnnotationTarget.PROPERTY)
annotation class JsonName(val name: String) {
}