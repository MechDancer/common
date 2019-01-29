package org.mechdancer.common.collection.trie

import java.util.*

class TrieNode(internal val value: Char? = null) {

    internal var count = 0

    internal val child = LinkedList<TrieNode>()

    internal var end = false

    override fun toString(): String = "[${value ?: " "}]"

}