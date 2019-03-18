package com.chrissen.kotlinstudy.chapter4

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/5.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

interface Focusable {

    fun setFocus(b : Boolean){
        println("I ${ if (b) "got" else "lost"} focus.")
    }

    fun showoff() = println("i'm focusable")

}