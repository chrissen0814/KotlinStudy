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

data class Person(val firstName: String, val lastName : String) : Comparable<Person>{

    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }


}