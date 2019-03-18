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

class Button : Clickable, Focusable {
    override fun showoff() {
        super<Clickable>.showoff()
    }

    override fun click() {
        println("I was clicked")
    }
}