package com.chrissen.kotlinstudy.chapter10

import ru.yole.jkid.DeserializeInterface

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/4/16.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */

data class Worker(val name: String, @DeserializeInterface(CompanyImpl::class) val company: Company) {
}