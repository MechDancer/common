package org.mechdancer.common.collection.bs

class BSTree<T : Comparable<T>> {

    internal var root = BSNode<T>()


    private fun insert(node: BSNode<T>) {
        var a: BSNode<T>? = root
        var b: BSNode<T>? = null

        while (a != null) {
            b = a
            a = if (node.value < a.value)
                a.left else a.right
        }
        node.parent = b
        if (b == null)
            root = node
        else {
            if (node.value < b.value)
                b.left = node
            else b.right = node
        }
    }
}