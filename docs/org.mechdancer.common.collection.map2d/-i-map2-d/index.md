---
title: IMap2D - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.collection.map2d</a> / <a href="./index.html">IMap2D</a></div>

# IMap2D

<div class="signature"><code><span class="keyword">interface </span><span class="identifier">IMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span></code></div>

二维映射

### Parameters

<code>T</code> - 第一种键类型

<code>U</code> - 第二种键类型

<code>V</code> - 值类型

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="keys0.html">keys0</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">val </span><span class="identifier">keys0</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html"><span class="identifier">Set</span></a><span class="symbol">&lt;</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

获取键<a href="index.html#T">T</a>集合


</td>
</tr>
<tr>
<td markdown="1">

<a href="keys1.html">keys1</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">val </span><span class="identifier">keys1</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html"><span class="identifier">Set</span></a><span class="symbol">&lt;</span><a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">&gt;</span></code></div>

获取键<a href="index.html#U">U</a>集合


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="contains-key0.html">containsKey0</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">containsKey0</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.map2d.IMap2D$containsKey0(org.mechdancer.common.collection.map2d.IMap2D.T)/key">key</span><span class="symbol">:</span>&nbsp;<a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

判断是否包含某个键<a href="index.html#T">T</a>


</td>
</tr>
<tr>
<td markdown="1">

<a href="contains-key1.html">containsKey1</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">containsKey1</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.map2d.IMap2D$containsKey1(org.mechdancer.common.collection.map2d.IMap2D.U)/key">key</span><span class="symbol">:</span>&nbsp;<a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

判断是否包含某个键<a href="index.html#U">U</a>


</td>
</tr>
<tr>
<td markdown="1">

<a href="get.html">get</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">operator</span> <span class="keyword">fun </span><span class="identifier">get</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.map2d.IMap2D$get(org.mechdancer.common.collection.map2d.IMap2D.T, org.mechdancer.common.collection.map2d.IMap2D.U)/t">t</span><span class="symbol">:</span>&nbsp;<a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">, </span><span class="parameterName" id="org.mechdancer.common.collection.map2d.IMap2D$get(org.mechdancer.common.collection.map2d.IMap2D.T, org.mechdancer.common.collection.map2d.IMap2D.U)/u">u</span><span class="symbol">:</span>&nbsp;<a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="index.html#V"><span class="identifier">V</span></a><span class="symbol">?</span></code></div>

获取值


</td>
</tr>
<tr>
<td markdown="1">

<a href="to-pair-map.html">toPairMap</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">fun </span><span class="identifier">toPairMap</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html"><span class="identifier">Map</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html"><span class="identifier">Pair</span></a><span class="symbol">&lt;</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">&gt;</span><span class="symbol">,</span>&nbsp;<a href="index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转键对映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="values0.html">values0</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">fun </span><span class="identifier">values0</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.map2d.IMap2D$values0(org.mechdancer.common.collection.map2d.IMap2D.T)/t">t</span><span class="symbol">:</span>&nbsp;<a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html"><span class="identifier">Map</span></a><span class="symbol">&lt;</span><a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="index.html#V"><span class="identifier">V</span></a><span class="symbol">?</span><span class="symbol">&gt;</span></code></div>

按键<a href="index.html#T">T</a>查找


</td>
</tr>
<tr>
<td markdown="1">

<a href="values1.html">values1</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">fun </span><span class="identifier">values1</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.map2d.IMap2D$values1(org.mechdancer.common.collection.map2d.IMap2D.U)/u">u</span><span class="symbol">:</span>&nbsp;<a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html"><span class="identifier">Map</span></a><span class="symbol">&lt;</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="index.html#V"><span class="identifier">V</span></a><span class="symbol">?</span><span class="symbol">&gt;</span></code></div>

按键<a href="index.html#U">U</a>查找


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

<a href="../fill-by.html">fillBy</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">fillBy</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$fillBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.fillBy.T, org.mechdancer.common.collection.map2d.fillBy.U, org.mechdancer.common.collection.map2d.fillBy.V)), kotlin.Function2((org.mechdancer.common.collection.map2d.fillBy.T, org.mechdancer.common.collection.map2d.fillBy.U, org.mechdancer.common.collection.map2d.fillBy.V)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="../fill-by.html#V"><span class="identifier">V</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="../-i-complete-map2-d/index.html"><span class="identifier">ICompleteMap2D</span></a><span class="symbol">&lt;</span><a href="../fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="../map-value.html">mapValue</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">, </span><span class="identifier">V1</span><span class="symbol">&gt;</span> <a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../map-value.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">mapValue</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$mapValue(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.mapValue.T, org.mechdancer.common.collection.map2d.mapValue.U, org.mechdancer.common.collection.map2d.mapValue.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.mapValue.V, org.mechdancer.common.collection.map2d.mapValue.V1)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../map-value.html#V"><span class="identifier">V</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="../map-value.html#V1"><span class="identifier">V1</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../map-value.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#V1"><span class="identifier">V1</span></a><span class="symbol">&gt;</span></code></div>

值映射到另一表


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

<a href="../to-map2-d.html">toMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../to-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">toMap2D</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../to-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="../to-mutable-map2-d.html">toMutableMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../to-mutable-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">toMutableMap2D</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../-i-mutable-map2-d/index.html"><span class="identifier">IMutableMap2D</span></a><span class="symbol">&lt;</span><a href="../to-mutable-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="../view-by.html">viewBy</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../view-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../view-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../view-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">viewBy</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f0">f0</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../view-by.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f1">f1</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../view-by.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f2">f2</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../view-by.html#V"><span class="identifier">V</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

通用转字符串


</td>
</tr>
<tr>
<td markdown="1">

<a href="../view-default.html">viewDefault</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../view-default.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../view-default.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../view-default.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">viewDefault</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

通用转字符串


</td>
</tr>
</tbody>
</table>

### Inheritors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../-i-complete-map2-d/index.html">ICompleteMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ICompleteMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../-i-complete-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../-i-complete-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../-i-complete-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

完全二维映射
通过固定映射函数保证表填满


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-i-complete-symmetric-map2-d/index.html">ICompleteSymmetricMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ICompleteSymmetricMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../-i-complete-symmetric-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../-i-complete-symmetric-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../-i-complete-symmetric-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

自动填充对称二维映射
保证表是填满的正方形


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-i-mutable-map2-d/index.html">IMutableMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">IMutableMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../-i-mutable-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../-i-mutable-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../-i-mutable-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="../-pair-map2-d/index.html">PairMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">PairMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html"><span class="identifier">Map</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html"><span class="identifier">Pair</span></a><span class="symbol">&lt;</span><a href="../-pair-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../-pair-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">&gt;</span><span class="symbol">,</span>&nbsp;<a href="../-pair-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="./index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../-pair-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../-pair-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../-pair-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

二维映射


</td>
</tr>
</tbody>
</table>
