---
title: CompletePairMap2D - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.collection.map2d</a> / <a href="./index.html">CompletePairMap2D</a></div>

# CompletePairMap2D

<div class="signature"><code><span class="keyword">class </span><span class="identifier">CompletePairMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="../-i-complete-map2-d/index.html"><span class="identifier">ICompleteMap2D</span></a><span class="symbol">&lt;</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

自填充二维映射

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">CompletePairMap2D</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.collection.map2d.CompletePairMap2D$<init>(kotlin.Function2((org.mechdancer.common.collection.map2d.CompletePairMap2D.T, org.mechdancer.common.collection.map2d.CompletePairMap2D.U, org.mechdancer.common.collection.map2d.CompletePairMap2D.V)))/map">map</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="index.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="index.html#V"><span class="identifier">V</span></a><span class="symbol">)</span></code></div>

自填充二维映射


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
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">fillBy</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$fillBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.fillBy.T, org.mechdancer.common.collection.map2d.fillBy.U, org.mechdancer.common.collection.map2d.fillBy.V)), kotlin.Function2((org.mechdancer.common.collection.map2d.fillBy.T, org.mechdancer.common.collection.map2d.fillBy.U, org.mechdancer.common.collection.map2d.fillBy.V)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="../fill-by.html#V"><span class="identifier">V</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="../-i-complete-map2-d/index.html"><span class="identifier">ICompleteMap2D</span></a><span class="symbol">&lt;</span><a href="../fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../fill-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="../map-value.html">mapValue</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">, </span><span class="identifier">V1</span><span class="symbol">&gt;</span> <a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../map-value.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">mapValue</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$mapValue(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.mapValue.T, org.mechdancer.common.collection.map2d.mapValue.U, org.mechdancer.common.collection.map2d.mapValue.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.mapValue.V, org.mechdancer.common.collection.map2d.mapValue.V1)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../map-value.html#V"><span class="identifier">V</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="../map-value.html#V1"><span class="identifier">V1</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../map-value.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../map-value.html#V1"><span class="identifier">V1</span></a><span class="symbol">&gt;</span></code></div>

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
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../to-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">toMap2D</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../to-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="../to-mutable-map2-d.html">toMutableMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../to-mutable-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">toMutableMap2D</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../-i-mutable-map2-d/index.html"><span class="identifier">IMutableMap2D</span></a><span class="symbol">&lt;</span><a href="../to-mutable-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../to-mutable-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="../view-by.html">viewBy</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../view-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../view-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../view-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">viewBy</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f0">f0</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../view-by.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f1">f1</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../view-by.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f2">f2</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="../view-by.html#V"><span class="identifier">V</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

通用转字符串


</td>
</tr>
<tr>
<td markdown="1">

<a href="../view-default.html">viewDefault</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="../-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="../view-default.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="../view-default.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="../view-default.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">viewDefault</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

通用转字符串


</td>
</tr>
</tbody>
</table>
