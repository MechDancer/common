---
title: safeCast - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.extension</a> / <a href="index.html">kotlin.Any</a> / <a href="./safe-cast.html">safeCast</a></div>

# safeCast

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="keyword">reified</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">safeCast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="safe-cast.html#T"><span class="identifier">T</span></a><span class="symbol">?</span></code></div>

Casts <a href="safe-cast/-this-.html">this</a> to the class represented by type parameter <a href="safe-cast.html#T">T</a>.
Returns <code>null</code> if the value is <code>null</code> or if it is not an instance of <a href="safe-cast.html#T">T</a>.

将一个实例转换到 <a href="safe-cast.html#T">T</a> 表示的类型，其不是 <a href="safe-cast.html#T">T</a> 实例或为 <code>null</code> 则返回 <code>null</code>。

