---
title: TrieTree - common
---

[common](../../index.html) / [org.mechdancer.common.collection.trie](../index.html) / [TrieTree](./index.html)

# TrieTree

`class TrieTree`

字典树

### Constructors

| [&lt;init&gt;](-init-.html) | 字典树`TrieTree()` |

### Functions

| [count](count.html) | 获取 [word](count.html#org.mechdancer.common.collection.trie.TrieTree$count(kotlin.String)/word) 词频`fun count(word: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [insert](insert.html) | 插入一个单词`fun insert(word: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [remove](remove.html) | 移除一个单词`fun remove(word: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [search](search.html) | 查找一个单词`fun search(word: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [searchNode](search-node.html) | 查找一个节点`fun searchNode(word: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`TrieNode`](../-trie-node/index.html)`?` |

### Extension Functions

| [contains](../contains.html) | 如果包含单词 [word](../contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieTree, kotlin.String)/word)，返回 `true``operator fun `[`TrieTree`](./index.html)`.contains(word: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [treeView](../tree-view.html) | 画成树状图`fun `[`TrieTree`](./index.html)`.treeView(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

