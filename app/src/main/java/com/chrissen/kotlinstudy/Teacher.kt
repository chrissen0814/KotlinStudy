package com.chrissen.kotlinstudy

/**
 * Function:
 * <br></br>
 * Describe:
 * <br></br>
 * Author: chris on 2019/2/25.
 * <br></br>
 * Email: chrissen0814@gmail.com
 */

class Teacher(name: String, var age: Int, school: String) {

    var name: String? = null
        get() = if (field == null) "" else field
    var school: String? = null
        get() = if (field == null) "" else field

    init {
        this.name = name
        this.school = school
    }
}
