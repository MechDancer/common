---
title: org.mechdancer.common.collection.trie - 
layout: api
---



## Package org.mechdancer.common.collection.trie

### Types

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-trie-node/index.html">TrieNode</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">TrieNode</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="-trie-tree/index.html">TrieTree</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">TrieTree</span></code></div>

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

<a href="add-child.html">addChild</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">.</span><span class="identifier">addChild</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie$addChild(org.mechdancer.common.collection.trie.TrieNode, org.mechdancer.common.collection.trie.TrieNode)/trieNode">trieNode</span><span class="symbol">:</span>&nbsp;<a href="-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

添加一个子节点


</td>
</tr>
<tr>
<td markdown="1">

<a href="contains.html">contains</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><a href="-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">.</span><span class="identifier">contains</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value">value</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html"><span class="identifier">Char</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

如果包含值为 <a href="contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value">value</a> 的子节点，返回 <code>true</code>

<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><a href="-trie-tree/index.html"><span class="identifier">TrieTree</span></a><span class="symbol">.</span><span class="identifier">contains</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieTree, kotlin.String)/word">word</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

如果包含单词 <a href="contains.html#org.mechdancer.common.collection.trie$contains(org.mechdancer.common.collection.trie.TrieTree, kotlin.String)/word">word</a>，返回 <code>true</code>


</td>
</tr>
<tr>
<td markdown="1">

<a href="get.html">get</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><a href="-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">.</span><span class="identifier">get</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie$get(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value">value</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html"><span class="identifier">Char</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">?</span></code></div>

获取该节点下的值为 <a href="get.html#org.mechdancer.common.collection.trie$get(org.mechdancer.common.collection.trie.TrieNode, kotlin.Char)/value">value</a> 的子节点


</td>
</tr>
<tr>
<td markdown="1">

<a href="is-end.html">isEnd</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">.</span><span class="identifier">isEnd</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

是否为叶子节点


</td>
</tr>
<tr>
<td markdown="1">

<a href="tree-view.html">treeView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><a href="-trie-node/index.html"><span class="identifier">TrieNode</span></a><span class="symbol">.</span><span class="identifier">treeView</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.trie$treeView(org.mechdancer.common.collection.trie.TrieNode, kotlin.Int)/indent">indent</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a>&nbsp;<span class="symbol">=</span>&nbsp;0<span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><a href="-trie-tree/index.html"><span class="identifier">TrieTree</span></a><span class="symbol">.</span><span class="identifier">treeView</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

画成树状图


</td>
</tr>
</tbody>
</table>
