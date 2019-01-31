---
title: org.mechdancer.common.collection.trie - 
---

[org.mechdancer.common.collection.trie](./index.html)

## Package org.mechdancer.common.collection.trie

### Types

| [TrieNode](-trie-node/index.html) | `class TrieNode` |
| [TrieTree](-trie-tree/index.html) | `class TrieTree`<br>字典树 |

### Functions

| [addChild](add-child.html) | `fun `[`TrieNode`](-trie-node/index.html)`.addChild(trieNode: `[`TrieNode`](-trie-node/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>添加一个子节点 |
| [contains](contains.html) | `operator fun `[`TrieNode`](-trie-node/index.html)`.contains(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>如果包含值为 [value](contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value) 的子节点，返回 `true``operator fun `[`TrieTree`](-trie-tree/index.html)`.contains(word: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>如果包含单词 [word](contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieTree, kotlin.String)/word)，返回 `true` |
| [get](get.html) | `operator fun `[`TrieNode`](-trie-node/index.html)`.get(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`TrieNode`](-trie-node/index.html)`?`<br>获取该节点下的值为 [value](get.html#org.mechdancer.common.collection.trie$get(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value) 的子节点 |
| [isEnd](is-end.html) | `fun `[`TrieNode`](-trie-node/index.html)`.isEnd(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>是否为叶子节点 |
| [treeView](tree-view.html) | `fun `[`TrieNode`](-trie-node/index.html)`.treeView(indent: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>`fun `[`TrieTree`](-trie-tree/index.html)`.treeView(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>画成树状图 |

