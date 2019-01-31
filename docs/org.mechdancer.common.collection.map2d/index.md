---
title: org.mechdancer.common.collection.map2d - 
layout: api
---



## Package org.mechdancer.common.collection.map2d

### Types

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-complete-pair-map2-d/index.html">CompletePairMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">CompletePairMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-i-complete-map2-d/index.html"><span class="identifier">ICompleteMap2D</span></a><span class="symbol">&lt;</span><a href="-complete-pair-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-complete-pair-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="-complete-pair-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

自填充二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="-complete-symmetric-pair-map2-d/index.html">CompleteSymmetricPairMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">CompleteSymmetricPairMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-i-complete-symmetric-map2-d/index.html"><span class="identifier">ICompleteSymmetricMap2D</span></a><span class="symbol">&lt;</span><a href="-complete-symmetric-pair-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-complete-symmetric-pair-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

完全对称表


</td>
</tr>
<tr>
<td markdown="1">

<a href="-i-complete-map2-d/index.html">ICompleteMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ICompleteMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="-i-complete-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-i-complete-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="-i-complete-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

完全二维映射
通过固定映射函数保证表填满


</td>
</tr>
<tr>
<td markdown="1">

<a href="-i-complete-symmetric-map2-d/index.html">ICompleteSymmetricMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">ICompleteSymmetricMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="-i-complete-symmetric-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-i-complete-symmetric-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-i-complete-symmetric-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

自动填充对称二维映射
保证表是填满的正方形


</td>
</tr>
<tr>
<td markdown="1">

<a href="-i-map2-d/index.html">IMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">IMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span></code></div>

二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="-i-mutable-map2-d/index.html">IMutableMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">interface </span><span class="identifier">IMutableMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="-i-mutable-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-i-mutable-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="-i-mutable-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="-mutable-pair-map2-d/index.html">MutablePairMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">MutablePairMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="-i-mutable-map2-d/index.html"><span class="identifier">IMutableMap2D</span></a><span class="symbol">&lt;</span><a href="-mutable-pair-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-mutable-pair-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="-mutable-pair-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="-pair-map2-d/index.html">PairMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">PairMap2D</span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span>&nbsp;<span class="symbol">:</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html"><span class="identifier">Map</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html"><span class="identifier">Pair</span></a><span class="symbol">&lt;</span><a href="-pair-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-pair-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">&gt;</span><span class="symbol">,</span>&nbsp;<a href="-pair-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="-pair-map2-d/index.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="-pair-map2-d/index.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="-pair-map2-d/index.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

二维映射


</td>
</tr>
</tbody>
</table>

### Extensions for External Classes

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="kotlin.collections.-set/index.html">kotlin.collections.Set</a>


</td>
<td markdown="1">

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="fill-by.html">fillBy</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="fill-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">fillBy</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$fillBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.fillBy.T, org.mechdancer.common.collection.map2d.fillBy.U, org.mechdancer.common.collection.map2d.fillBy.V)), kotlin.Function2((org.mechdancer.common.collection.map2d.fillBy.T, org.mechdancer.common.collection.map2d.fillBy.U, org.mechdancer.common.collection.map2d.fillBy.V)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="fill-by.html#V"><span class="identifier">V</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-i-complete-map2-d/index.html"><span class="identifier">ICompleteMap2D</span></a><span class="symbol">&lt;</span><a href="fill-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="fill-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="fill-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="map.html">map</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <span class="identifier">map</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$map(kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.T)), kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.U)), kotlin.Function2((org.mechdancer.common.collection.map2d.map.T, org.mechdancer.common.collection.map2d.map.U, org.mechdancer.common.collection.map2d.map.V)))/t">t</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html"><span class="identifier">Iterable</span></a><span class="symbol">&lt;</span><a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$map(kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.T)), kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.U)), kotlin.Function2((org.mechdancer.common.collection.map2d.map.T, org.mechdancer.common.collection.map2d.map.U, org.mechdancer.common.collection.map2d.map.V)))/u">u</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html"><span class="identifier">Iterable</span></a><span class="symbol">&lt;</span><a href="map.html#U"><span class="identifier">U</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$map(kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.T)), kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.U)), kotlin.Function2((org.mechdancer.common.collection.map2d.map.T, org.mechdancer.common.collection.map2d.map.U, org.mechdancer.common.collection.map2d.map.V)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="map.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="map.html#V"><span class="identifier">V</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="map.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="map.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

构造二维映射

<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <span class="identifier">map</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$map(kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.T)), kotlin.Function2((org.mechdancer.common.collection.map2d.map.T, , org.mechdancer.common.collection.map2d.map.V)))/set">set</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html"><span class="identifier">Iterable</span></a><span class="symbol">&lt;</span><a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$map(kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.map.T)), kotlin.Function2((org.mechdancer.common.collection.map2d.map.T, , org.mechdancer.common.collection.map2d.map.V)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="map.html#V"><span class="identifier">V</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="map.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="map.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

展开对称二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="map-value.html">mapValue</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">, </span><span class="identifier">V1</span><span class="symbol">&gt;</span> <a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="map-value.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="map-value.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="map-value.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">mapValue</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$mapValue(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.mapValue.T, org.mechdancer.common.collection.map2d.mapValue.U, org.mechdancer.common.collection.map2d.mapValue.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.mapValue.V, org.mechdancer.common.collection.map2d.mapValue.V1)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="map-value.html#V"><span class="identifier">V</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="map-value.html#V1"><span class="identifier">V1</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="map-value.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="map-value.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="map-value.html#V1"><span class="identifier">V1</span></a><span class="symbol">&gt;</span></code></div>

值映射到另一表


</td>
</tr>
<tr>
<td markdown="1">

<a href="plus-assign.html">plusAssign</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="-i-complete-symmetric-map2-d/index.html"><span class="identifier">ICompleteSymmetricMap2D</span></a><span class="symbol">&lt;</span><a href="plus-assign.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="plus-assign.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">plusAssign</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$plusAssign(org.mechdancer.common.collection.map2d.ICompleteSymmetricMap2D((org.mechdancer.common.collection.map2d.plusAssign.T, org.mechdancer.common.collection.map2d.plusAssign.V)), org.mechdancer.common.collection.map2d.plusAssign.T)/t">t</span><span class="symbol">:</span>&nbsp;<a href="plus-assign.html#T"><span class="identifier">T</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

添加或修改表项


</td>
</tr>
<tr>
<td markdown="1">

<a href="set.html">set</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="-i-mutable-map2-d/index.html"><span class="identifier">IMutableMap2D</span></a><span class="symbol">&lt;</span><a href="set.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="set.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="set.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">set</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$set(org.mechdancer.common.collection.map2d.IMutableMap2D((org.mechdancer.common.collection.map2d.set.T, org.mechdancer.common.collection.map2d.set.U, org.mechdancer.common.collection.map2d.set.V)), org.mechdancer.common.collection.map2d.set.T, org.mechdancer.common.collection.map2d.set.U, org.mechdancer.common.collection.map2d.set.V)/t">t</span><span class="symbol">:</span>&nbsp;<a href="set.html#T"><span class="identifier">T</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$set(org.mechdancer.common.collection.map2d.IMutableMap2D((org.mechdancer.common.collection.map2d.set.T, org.mechdancer.common.collection.map2d.set.U, org.mechdancer.common.collection.map2d.set.V)), org.mechdancer.common.collection.map2d.set.T, org.mechdancer.common.collection.map2d.set.U, org.mechdancer.common.collection.map2d.set.V)/u">u</span><span class="symbol">:</span>&nbsp;<a href="set.html#U"><span class="identifier">U</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$set(org.mechdancer.common.collection.map2d.IMutableMap2D((org.mechdancer.common.collection.map2d.set.T, org.mechdancer.common.collection.map2d.set.U, org.mechdancer.common.collection.map2d.set.V)), org.mechdancer.common.collection.map2d.set.T, org.mechdancer.common.collection.map2d.set.U, org.mechdancer.common.collection.map2d.set.V)/v">v</span><span class="symbol">:</span>&nbsp;<a href="set.html#V"><span class="identifier">V</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

添加或修改表项


</td>
</tr>
<tr>
<td markdown="1">

<a href="stretch2-d.html">stretch2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <span class="identifier">stretch2D</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$stretch2D(kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.stretch2D.T)), kotlin.Function2((org.mechdancer.common.collection.map2d.stretch2D.T, , org.mechdancer.common.collection.map2d.stretch2D.V)))/t">t</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html"><span class="identifier">Iterable</span></a><span class="symbol">&lt;</span><a href="stretch2-d.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$stretch2D(kotlin.collections.Iterable((org.mechdancer.common.collection.map2d.stretch2D.T)), kotlin.Function2((org.mechdancer.common.collection.map2d.stretch2D.T, , org.mechdancer.common.collection.map2d.stretch2D.V)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="stretch2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="stretch2-d.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="stretch2-d.html#V"><span class="identifier">V</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-i-complete-symmetric-map2-d/index.html"><span class="identifier">ICompleteSymmetricMap2D</span></a><span class="symbol">&lt;</span><a href="stretch2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="stretch2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

展开可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="to-map2-d.html">toMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="to-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="to-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="to-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">toMap2D</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="to-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="to-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="to-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="to-mutable-map2-d.html">toMutableMap2D</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="to-mutable-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="to-mutable-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="to-mutable-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">toMutableMap2D</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="-i-mutable-map2-d/index.html"><span class="identifier">IMutableMap2D</span></a><span class="symbol">&lt;</span><a href="to-mutable-map2-d.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="to-mutable-map2-d.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="to-mutable-map2-d.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span></code></div>

转不可变二维映射


</td>
</tr>
<tr>
<td markdown="1">

<a href="view-by.html">viewBy</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="view-by.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="view-by.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="view-by.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">viewBy</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f0">f0</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="view-by.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f1">f1</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="view-by.html#U"><span class="identifier">U</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.collection.map2d$viewBy(org.mechdancer.common.collection.map2d.IMap2D((org.mechdancer.common.collection.map2d.viewBy.T, org.mechdancer.common.collection.map2d.viewBy.U, org.mechdancer.common.collection.map2d.viewBy.V)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.T, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.U, kotlin.String)), kotlin.Function1((org.mechdancer.common.collection.map2d.viewBy.V, kotlin.String)))/f2">f2</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="view-by.html#V"><span class="identifier">V</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

通用转字符串


</td>
</tr>
<tr>
<td markdown="1">

<a href="view-default.html">viewDefault</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">, </span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">V</span><span class="symbol">&gt;</span> <a href="-i-map2-d/index.html"><span class="identifier">IMap2D</span></a><span class="symbol">&lt;</span><a href="view-default.html#T"><span class="identifier">T</span></a><span class="symbol">,</span>&nbsp;<a href="view-default.html#U"><span class="identifier">U</span></a><span class="symbol">,</span>&nbsp;<a href="view-default.html#V"><span class="identifier">V</span></a><span class="symbol">&gt;</span><span class="symbol">.</span><span class="identifier">viewDefault</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

通用转字符串


</td>
</tr>
</tbody>
</table>
