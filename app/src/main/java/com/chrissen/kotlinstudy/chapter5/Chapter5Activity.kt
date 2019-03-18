package com.chrissen.kotlinstudy.chapter5

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.chrissen.kotlinstudy.R
import kotlinx.android.synthetic.main.activity_chapter5.*

class Chapter5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter5)
        button.setOnClickListener { Toast.makeText(this, "Hello Lambda", Toast.LENGTH_SHORT).show() }
        button.setOnClickListener { v : View -> println("Lambda") }
        val person = listOf(Person("Alice", 29), Person("Bob", 31))
        println(person.maxBy { it.age })
        println(person.maxBy(Person::age)) //成员引用

        val sum = {x : Int, y : Int ->
            println("Computing the sum of $x and $y...")
            x + y
        }
        println(sum(1,2))

        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        val name = person.joinToString(separator = " ", transform = {p : Person -> p.name})
        val name2 = people.joinToString(" "){p : Person -> p.name}

        println(person.filter { it.age > 30 })

        println(people.map { it.name })
        println(Person::name)

        val list = listOf(1, 2, 3, 4)
        list.filter { it % 2 == 0 }//返回满足条件德新集合
        println(list.map { it * it })

        //打印出年龄超过30岁人的姓名
        people.filter { it.age > 30 }.map { it.name }

        val maxAge = people.maxBy { it.age }!!.age
        people.filter { it.age == maxAge }

        val numbers = mapOf(0 to "zero", 1 to "One")
        numbers.map { it.value.toUpperCase() }

        val canBeInClub27 = {p : Person -> p.age <= 27}

        println(people.all(canBeInClub27)) //所有元素是否都满足
        println(people.any(canBeInClub27)) //至少有一个满足
        println(people.count(canBeInClub27)) //满足条件的个数

        //下面两个函数相等
        println(people.find(canBeInClub27)) //找到第一个满足条件的元素或者null
        println(people.firstOrNull(canBeInClub27))

        println(people.groupBy { Person::age }) //返回分组的map，key是分组的依据，值是满足条件的元素分组

        val strings = listOf("a", "ab", "b")
        strings.groupBy(String::first)

        //CharSequence.toList Returns a [List] containing all characters.
        println(strings.flatMap { it.toList() })

        val naturalNumbers = generateSequence(0){it + 1}
        val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }

        val listener = View.OnClickListener{view -> println("Hello")}
    }

    //prefix前缀
    fun printMessageWithPrefix(messages : Collection<String>, prefix : String){
        messages.forEach { "$prefix $it" }
    }

    fun printProblemCounts(responses : Collection<String>){
        var clientErrors = 0
        var serverErrors = 0
        responses.forEach {
            if(it.startsWith("4")){
                clientErrors++
            }else if(it.startsWith("5")){
                serverErrors++
            }
        }
        println("$clientErrors client errors, $serverErrors server errors")
    }

    val predicate = Person::isAdult

    //with函数
    fun alphabet(): String = with(StringBuilder()){
        for(letter in 'A'..'Z'){
            this.append(letter)
        }
        append("\nI Know the alphabet!")
        this.toString()
    }

    fun alphabetWithApply() = StringBuilder().apply {
        for(letter in 'A'..'Z'){
            this.append(letter)
        }
        append("\nI Know the alphabet")
    }.toString()

    fun createViewWithCustomAttributes(context: Context) =
            TextView(context).apply {
                text = "Sample Text"
                textSize = 20.0f
                setPadding(10,0,0,0)
            }

}
