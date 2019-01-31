---
title: org.mechdancer.common.extension.kotlin.Any - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.extension</a> / <a href="./index.html">kotlin.Any</a></div>

### Extensions for kotlin.Any

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="cast.html">cast</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">cast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="cast.html#T"><span class="identifier">T</span></a></code></div>

Casts <a href="cast/-this-.html">this</a> to the class represented by type parameter <a href="cast.html#T">T</a>.
Throws an exception if the value is <code>null</code> or if it is not an instance of <a href="cast.html#T">T</a>.


</td>
</tr>
<tr>
<td markdown="1">

<a href="safe-cast.html">safeCast</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">safeCast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="safe-cast.html#T"><span class="identifier">T</span></a><span class="symbol">?</span></code></div>

Casts <a href="safe-cast/-this-.html">this</a> to the class represented by type parameter <a href="safe-cast.html#T">T</a>.
Returns <code>null</code> if the value is <code>null</code> or if it is not an instance of <a href="safe-cast.html#T">T</a>.


</td>
</tr>
</tbody>
</table>
