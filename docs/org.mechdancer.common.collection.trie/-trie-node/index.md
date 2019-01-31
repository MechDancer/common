---
title: TrieNode - 
---

[org.mechdancer.common.collection.trie](../index.html) / [TrieNode](./index.html)

# TrieNode

`class TrieNode`

### Constructors

| [&lt;init&gt;](-init-.html) | `TrieNode(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = null)` |

### Functions

| [toString](to-string.html) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Extension Functions

| [addChild](../add-child.html) | `fun `[`TrieNode`](./index.html)`.addChild(trieNode: `[`TrieNode`](./index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>添加一个子节点 |
| [cast](../../org.mechdancer.common.extension/kotlin.-any/cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.cast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T)<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). Throws an exception if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/cast.html#T). |
| [contains](../contains.html) | `operator fun `[`TrieNode`](./index.html)`.contains(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>如果包含值为 [value](../contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value) 的子节点，返回 `true` |
| [get](../get.html) | `operator fun `[`TrieNode`](./index.html)`.get(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`TrieNode`](./index.html)`?`<br>获取该节点下的值为 [value](../get.html#org.mechdancer.common.collection.trie$get(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value) 的子节点 |
| [isEnd](../is-end.html) | `fun `[`TrieNode`](./index.html)`.isEnd(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>是否为叶子节点 |
| [safeCast](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html) | `fun <T> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.safeCast(): `[`T`](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T)`?`<br>Casts [this](../../org.mechdancer.common.extension/kotlin.-any/safe-cast/-this-.html) to the class represented by type parameter [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). Returns `null` if the value is `null` or if it is not an instance of [T](../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T). |
| [treeView](../tree-view.html) | `fun `[`TrieNode`](./index.html)`.treeView(indent: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>画成树状图 |

