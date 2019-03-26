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

data class Rectangle(val upperLeft : Point, val lowerRight : Point) {

    //in运算符
    operator fun contains(point: Point) : Boolean{
        return point.x in upperLeft.x until lowerRight.x &&
                point.y in upperLeft.y until  lowerRight.y
    }

}