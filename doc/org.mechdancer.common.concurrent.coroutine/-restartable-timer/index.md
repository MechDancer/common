---
title: RestartableTimer - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.concurrent.coroutine</a> / <a href="./index.html">RestartableTimer</a></div>

# RestartableTimer

<div class="signature"><code><span class="keyword">class </span><span class="identifier">RestartableTimer</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="http://docs.oracle.com/javase/6/docs/api/java/io/Closeable.html"><span class="identifier">Closeable</span></a></code></div>

可重启定时器

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">RestartableTimer</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.concurrent.coroutine.RestartableTimer$<init>()/scope">scope</span><span class="symbol">:</span>&nbsp;<span class="identifier">&lt;ERROR CLASS&gt;</span>&nbsp;<span class="symbol">=</span>&nbsp;GlobalScope<span class="symbol">)</span></code></div>

可重启定时器


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="running.html">running</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">running</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

判断是否正在运行


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="close.html">close</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">close</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

停止调度


</td>
</tr>
<tr>
<td markdown="1">

<a href="invoke.html">invoke</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="identifier">invoke</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/period">period</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="keyword">suspend </span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

立即调度一次 <a href="invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block">block</a>，并按照新的 <a href="invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/period">period</a> 定时反复调度 <a href="invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block">block</a>


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

<a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html">safeCast</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">safeCast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T"><span class="identifier">T</span></a><span class="symbol">?</span></code></div>

Casts <a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast/-this-.html">this</a> to the class represented by type parameter <a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T">T</a>.
Returns <code>null</code> if the value is <code>null</code> or if it is not an instance of <a href="../../org.mechdancer.common.extension/kotlin.-any/safe-cast.html#T">T</a>.


</td>
</tr>
</tbody>
</table>
