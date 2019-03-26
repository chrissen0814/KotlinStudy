package com.chrissen.kotlinstudy.chapter7

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/25.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

data class MutablePoint(var x: Int, var y : Int) {

    //只有var属性才有set函数
    operator fun set(index : Int, value: Int){
        when(index){
            0 -> x = value
            1 -> y = value
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }

    operator fun get(index : Int) : Int{
        return when(index){
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }

}