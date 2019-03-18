package com.chrissen.kotlinstudy.chapter4

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/3/6.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

class Person(val name: String) {

    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person {
            return Person(jsonText)
        }

    }

}