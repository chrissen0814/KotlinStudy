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

class User private constructor(val nickname: String){
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) = User(accountId.toString())
    }
}