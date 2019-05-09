package com.chrissen.kotlinstudy.chapter11

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/5/9.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

class Greetor(val name: String) {

    operator fun invoke(greeting: String){
        println("$name, $greeting")
    }

}