package org.mechdancer.common.collection.trie

/**
 * 获取该节点下的值为 [value] 的子节点
 */
operator fun TrieNode.get(value: Char) =
    if (this.value == value) this
    else child.find { it.value == value }

/**
 * 添加一个子节点
 */
fun TrieNode.addChild(trieNode: TrieNode) =
    child.add(trieNode)

/**
 * 如果包含值为 [value] 的子节点，返回 `true`
 */
operator fun TrieNode.contains(value: Char): Boolean = this[value] != null

/**
 * 是否为叶子节点
 */
fun TrieNode.isEnd() = end

/**
 * 如果包含单词 [word]，返回 `true`
 */
operator fun TrieTree.contains(word: String) = search(word)


/**
 * 画成树状图
 */
fun TrieNode.treeView(indent: Int = 0): String {
    val builder = StringBuilder()
    builder.append("$this\n")
    child.dropLast(1).forEach {
        builder
            .append(" |".repeat(indent))
            .append(" ├")
            .append(it.treeView(indent + 1))
    }
    child.takeLast(1).forEach {
        builder
            .append(" ".repeat(indent))
            .append(" └")
            .append(it.treeView(indent + 1))
    }
    return builder.toString()

}

/**
 * 画成树状图
 */
fun TrieTree.treeView(): String = root.treeView()