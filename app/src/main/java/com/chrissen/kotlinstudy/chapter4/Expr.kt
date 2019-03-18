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

sealed class Expr {

    class Num(val value : Int) : Expr()

    class Sum(val left: Expr, val right : Expr) : Expr()

}