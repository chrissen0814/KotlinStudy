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

class CollectionSet<T>(val innerSet: MutableCollection<T> = HashSet<T>())
    : MutableCollection<T> by innerSet{

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

}