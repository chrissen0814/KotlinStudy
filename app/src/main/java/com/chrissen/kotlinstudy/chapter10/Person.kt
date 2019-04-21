package com.chrissen.kotlinstudy.chapter10

import ru.yole.jkid.JsonExclude
import ru.yole.jkid.JsonName

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/4/16.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

data class Person(@JsonName("alias") val name: String,@JsonExclude val age: Int? = null)