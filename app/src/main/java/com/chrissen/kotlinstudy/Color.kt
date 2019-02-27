package com.chrissen.kotlinstudy

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/2/26.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

enum class Color(val r: Int, val g : Int, val b : Int) {
    //每个常量创建时指定属性值
    RED(255,0,0), ORANGE(255,165,0),
    YELLOW(255,255,0), GREEN(0,255,0),
    BLUE(0,0,255), INDIGO(75,0,130),
    VIOLET(238, 130, 238); //分号必须

    fun rgb() = (r * 256 + g) * 256 + b //给枚举类定义一个方法
}