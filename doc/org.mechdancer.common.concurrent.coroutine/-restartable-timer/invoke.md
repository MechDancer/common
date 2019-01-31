---
title: RestartableTimer.invoke - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.concurrent.coroutine</a> / <a href="index.html">RestartableTimer</a> / <a href="./invoke.html">invoke</a></div>

# invoke

<div class="signature"><code><span class="keyword">operator</span> <span class="keyword">fun </span><span class="identifier">invoke</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/period">period</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block">block</span><span class="symbol">:</span>&nbsp;<span class="keyword">suspend </span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

立即调度一次 <a href="invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block">block</a>，并按照新的 <a href="invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/period">period</a> 定时反复调度 <a href="invoke.html#org.mechdancer.common.concurrent.coroutine.RestartableTimer$invoke(kotlin.Long, kotlin.SuspendFunction0((kotlin.Unit)))/block">block</a>

