package com.chrissen.kotlinstudy
import com.chrissen.kotlinstudy.Color.*
import java.io.BufferedReader
import java.util.*

/**
 *  Function:定义函数的关键字：fun
 *  Kotlin中有很多乐趣（fun）哦！
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2019/2/26.
 *  <br/>
 *  Email: chrissen0814@gmail.com
 */
fun main(args: Array<String>){
    val name = if(args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello , $name") //字符串模板
    val person = Person("Chris", 30)
    println("${person.name}")

    for(i in 1..100){
        println(fizzBuzz(i))
    }

    for(i in 100 downTo 1 step 2){
        print(fizzBuzz(i))
    }

    for(i in 1 until 100){ //不包含结束值

    }

    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps){
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "100", "111")
    for((index, element) in list.withIndex()){
        println("$index : $element")
    }

    var number = 12
    val percetage = if( number in 0..100) number else throw IllegalArgumentException("A percentage value must be between")
}

/**
 * 表达式是有值的，意味者可以省略掉return,代码块的最后一个表达式会被作为结果返回
 * 表达式体的函数的返回值类型可以省略，但是有代码块的则不可以
 */
fun max(a : Int, b : Int) : Int = if(a > b) a else b //直接返回表达式，称作表达式体

val answer : Int = 43

/**
 * 自定义访问器
 * 大多数情况下，属性会有一个对应的支持字段来保存属性的值，但如果这个值可以及时计算，可以自定义getter
 */
class Rectangle(val height: Int, val width : Int){
    val isSquare : Boolean
    get(){ //自定义访问器
        return height == width
    }
}

/**
 * 可以有代码块，代码块中最后的表达式就是结果(对常规函数不成立)
 */
fun getMnemonic(color: Color) : String = when(color){ //when允许使用任意对象
    RED -> {
        println("Richard is Beautiful")
        "Richard"
    }
    Color.ORANGE -> "Of"
    YELLOW -> "York"
    GREEN -> "Gave"
    BLUE -> "Battle"
    Color.INDIGO, Color.VIOLET -> "In"
}


/**
 * when传递的参数可以是任意对象
 */
fun mix(c1 : Color, c2 : Color) = when(setOf(c1, c2)){
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw  Exception("Dirty color") //如果没有任何其他分支匹配则执行该行
}

/**
 * 省略参数的when语句必须添加else语句，分支条件为任意的布尔表达式
 * 优点不会创建额外的对象，缺点是更难理解
 */
fun mixOptimized(c1 : Color , c2 : Color) = when{
    (c1 == RED && c2 == YELLOW) ||
        (c1 == YELLOW && c2 == RED) -> ORANGE
    (c1 == YELLOW && c2 == BLUE) ||
            (c1 == BLUE && c2 == YELLOW) -> GREEN
    (c1 == BLUE && c2 == VIOLET) ||
            (c1 == VIOLET && c2 == BLUE) -> INDIGO
    else -> throw Exception("Dirty Color")
}


interface Expr
class Num(val value : Int) : Expr
class Sum(val left : Expr, val right : Expr): Expr

/**
 * 智能转换：IDE会使用背景色高亮显示智能转换
 * 可以使用as关键字来显示转换
 */
fun eval(e : Expr) : Int{
    if(e is Num){
        e.value
    }
    if(e is Sum){
        eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

//when检查实参值得类型
//fun eval(e : Expr) : Int = when(e){
//    is Num -> e.value
//    is Sum -> eval(e.right) + eval(e.left)
//    else -> throw IllegalArgumentException("Unknown expressions")
//}

fun fizzBuzz(i : Int) = when{
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

//判断是否（不）在该区间
fun isLetter(c : Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigic(c : Char) = c !in '0'..'9'

fun readNumber(reader : BufferedReader){
    val number = try { //try catch作为表达式
        Integer.parseInt(reader.readLine())
    }catch (e : NumberFormatException){
        return
    }
    println(number)
}
