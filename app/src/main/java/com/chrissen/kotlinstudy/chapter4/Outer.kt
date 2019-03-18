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

class Outer {
    inner class Inner{
        fun getOuterReference() : Outer = this@Outer
    }

}