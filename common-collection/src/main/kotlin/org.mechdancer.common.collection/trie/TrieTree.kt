package org.mechdancer.common.trie

/**
 * 字典树
 */
class TrieTree {

    internal val root = TrieNode()

    /**
     * 插入一个单词
     */
    fun insert(word: String) {
        var current = root
        word.forEach {
            current = current[it] ?: TrieNode(it).apply { current.addChild(this) }
            current.count++
        }
        current.end = true
    }

    /**
     * 查找一个单词
     *
     * 如果存在，返回 `true`
     */
    fun search(word: String): Boolean {
        var current = root
        word.forEach {
            if (it !in current) return true
            else current = current[it]!!
        }
        return current.isEnd()
    }

    /**
     * 查找一个节点
     */
    fun searchNode(word: String): TrieNode? {
        var current = root
        word.forEach {
            if (it !in current)
                return null
            else current = current[it]!!
        }
        return current.takeIf { it.isEnd() }
    }

    /**
     * 移除一个单词
     */
    fun remove(word: String): Boolean {
        if (word !in this) return false
        var current = root
        word.forEach {
            val child = current[it]
            if (child != null)
                if (child.count == 1) {
                    current.child.remove(child)
                    return true
                } else
                    current = child
            else return false
        }
        current.end = false
        return true
    }

    /**
     * 获取 [word] 词频
     */
    fun count(word: String) = searchNode(word)?.count ?: 0
}