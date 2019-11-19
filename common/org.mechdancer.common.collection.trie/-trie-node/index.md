---
title: TrieNode - common
---

[common](../../index.html) / [org.mechdancer.common.collection.trie](../index.html) / [TrieNode](./index.html)

# TrieNode

`class TrieNode`

### Constructors

| [&lt;init&gt;](-init-.html) | `TrieNode(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = null)` |

### Functions

| [toString](to-string.html) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Extension Functions

| [addChild](../add-child.html) | 添加一个子节点`fun `[`TrieNode`](./index.html)`.addChild(trieNode: `[`TrieNode`](./index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [contains](../contains.html) | 如果包含值为 [value](../contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value) 的子节点，返回 `true``operator fun `[`TrieNode`](./index.html)`.contains(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [get](../get.html) | 获取该节点下的值为 [value](../get.html#org.mechdancer.common.collection.trie$get(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value) 的子节点`operator fun `[`TrieNode`](./index.html)`.get(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`TrieNode`](./index.html)`?` |
| [isEnd](../is-end.html) | 是否为叶子节点`fun `[`TrieNode`](./index.html)`.isEnd(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [treeView](../tree-view.html) | 画成树状图`fun `[`TrieNode`](./index.html)`.treeView(indent: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

