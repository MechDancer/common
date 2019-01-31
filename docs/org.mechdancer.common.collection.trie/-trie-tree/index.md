---
title: TrieTree - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.collection.trie</a> / <a href="./index.html">TrieTree</a></div>

# TrieTree

<div class="signature"><code><span class="keyword">class </span><span class="identifier">TrieTree</span></code></div>

字典树

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">TrieTree</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

字典树


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="count.html">count</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">count</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie.TrieTree$count(kotlin.String)/word">word</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

获取 <a href="count.html#org.mechdancer.common.collection.trie.TrieTree$count(kotlin.String)/word">word</a> 词频


</td>
</tr>
<tr>
<td markdown="1">

<a href="insert.html">insert</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">insert</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie.TrieTree$insert(kotlin.String)/word">word</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

插入一个单词


</td>
</tr>
<tr>
<td markdown="1">

<a href="remove.html">remove</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">remove</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie.TrieTree$remove(kotlin.String)/word">word</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

移除一个单词


</td>
</tr>
<tr>
<td markdown="1">

<a href="search.html">search</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">search</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie.TrieTree$search(kotlin.String)/word">word</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

查找一个单词


</td>
</tr>
<tr>
<td markdown="1">

<a href="search-node.html">searchNode</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">searchNode</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie.TrieTree$searchNode(kotlin.String)/word">word</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="../-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">?</span></code></div>

查找一个节点


</td>
</tr>
</tbody>
</table>

### Extension Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../../org.mechdancer.common.extension/kotlin.-any/cast.html">cast</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">cast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../../org.mechdancer.common.extension/kotlin.-any/cast.html#T"><span class="identifier">T</span></a></code></div>

Casts <a href="../../org.mechdancer.common.extension/kotlin.-any/cast/-this-.html">this</a> to the class represented by type parameter <a href="../../org.mechdancer.common.extension/kotlin.-any/cast.html#T">T</a>.
Throws an exception if the value is <code>null</code> or if it is not an instance of <a href="../../org.mechdancer.common.extension/kotlin.-any/cast.html#T">T</a>.


</td>
</tr>
<tr>
<td markdown="1">

<a href="../contains.html">contains</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><a href="./index.html"><span class="identifier">TrieTree</span></a><span class="symbol">.</span><span class="identifier">contains</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieTree, kotlin.String)/word">word</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

如果包含单词 <a href="../contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieTree, kotlin.String)/word">word</a>，返回 <code>true</code>


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html">safeCast</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">safeCast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T"><span class="identifier">T</span></a><span class="symbol">?</span></code></div>

Casts <a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast/-this-.html">this</a> to the class represented by type parameter <a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T">T</a>.
Returns <code>null</code> if the value is <code>null</code> or if it is not an instance of <a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T">T</a>.


</td>
</tr>
<tr>
<td markdown="1">

<a href="../tree-view.html">treeView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="./index.html"><span class="identifier">TrieTree</span></a><span class="symbol">.</span><span class="identifier">treeView</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

画成树状图


</td>
</tr>
</tbody>
</table>
