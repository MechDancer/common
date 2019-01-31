---
title: cast - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.extension</a> / <a href="index.html">kotlin.Any</a> / <a href="./cast.html">cast</a></div>

# cast

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="keyword">reified</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">cast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="cast.html#T"><span class="identifier">T</span></a></code></div>

Casts <a href="cast/-this-.html">this</a> to the class represented by type parameter <a href="cast.html#T">T</a>.
Throws an exception if the value is <code>null</code> or if it is not an instance of <a href="cast.html#T">T</a>.

将一个实例转换到 <a href="cast.html#T">T</a> 表示的类型，其不是 <a href="cast.html#T">T</a> 实例或为 <code>null</code> 则抛出异常。

