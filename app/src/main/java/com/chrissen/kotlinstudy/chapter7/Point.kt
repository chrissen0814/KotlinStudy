package com.chrissen.kotlinstudy.chapter7

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/21.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

data class Point(val x : Int, val y: Int): Comparable<Point>{
    override fun compareTo(other: Point): Int {
        return compareValuesBy(this, other, Point::x, Point::y)
    }

    operator fun plus(other : Point) : Point{
        return Point(x + other.x, y + other.y)
    }

    operator fun times(scale : Double) : Point{
        return Point((x * scale).toInt(), (y * scale).toInt())
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Point) return false
        return other.x == x && other.y == y
    }

    operator fun get(index : Int) : Int{
        return when(index){
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }

}