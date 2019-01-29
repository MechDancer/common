package org.mechdancer.common.bs

class BSNode<T : Comparable<T>> {

    lateinit var value: T
        internal set

    var parent: BSNode<T>? = null
        internal set

    lateinit var left: BSNode<T>
        internal set

    lateinit var right: BSNode<T>
        internal set

}