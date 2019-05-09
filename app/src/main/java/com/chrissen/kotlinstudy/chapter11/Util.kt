package com.chrissen.kotlinstudy.chapter11

import android.os.Build
import android.support.annotation.RequiresApi
import java.time.LocalDate
import java.time.Period

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/5/9.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

fun buildString(buildAction: StringBuilder.() -> Unit) : String{
    val sb = StringBuilder()
    sb.buildAction()
    return sb.toString()
}

val Int.days: Period
@RequiresApi(Build.VERSION_CODES.O)
get() = Period.ofDays(this)

val Period.ago : LocalDate
@RequiresApi(Build.VERSION_CODES.O)
get() = LocalDate.now() - this
