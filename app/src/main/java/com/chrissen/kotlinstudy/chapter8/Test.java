package com.chrissen.kotlinstudy.chapter8;

import kotlin.jvm.functions.Function1;

/**
 * Function:
 * <br/>
 * Describe:
 * <br/>
 * Author: chris on 2019/3/31.
 * <br/>
 * Email: chrissen0814@gmail.com
 */

public class Test {

    public static void main(String[] args){
        UtilsKt.filter("Love", new Function1<Character, Boolean>() {
            @Override
            public Boolean invoke(Character character) {
                return true;
            }
        });
    }

}
