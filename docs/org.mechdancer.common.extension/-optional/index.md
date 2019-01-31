---
title: Optional - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.extension</a> / <a href="./index.html">Optional</a></div>

# Optional

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">class </span><span class="identifier">Optional</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span></code></div>

A discriminated union that encapsulates a value of type <a href="index.html#T">T</a>
or void represented by <code>Void</code>.

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="existent.html">existent</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">existent</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

Returns <code>true</code> if this instance has a value.
In this case <a href="nonexistent.html">nonexistent</a> returns <code>false</code>.


</td>
</tr>
<tr>
<td markdown="1">

<a href="nonexistent.html">nonexistent</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">nonexistent</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

Returns <code>true</code> if this instance has no value.
In this case <a href="existent.html">existent</a> returns <code>false</code>.


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="get-or-else.html">getOrElse</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">U</span><span class="symbol">, </span><span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="get-or-else.html#U"><span class="identifier">U</span></a><span class="symbol">&gt;</span> <span class="identifier">getOrElse</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.extension.Optional$getOrElse(org.mechdancer.common.extension.Optional.getOrElse.U)/otherwise">otherwise</span><span class="symbol">:</span>&nbsp;<a href="get-or-else.html#U"><span class="identifier">U</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="get-or-else.html#U"><span class="identifier">U</span></a></code></div>

Returns the encapsulated value if this instance <a href="existent.html">existent</a>
or <a href="get-or-else.html#org.mechdancer.common.extension.Optional$getOrElse(org.mechdancer.common.extension.Optional.getOrElse.U)/otherwise">otherwise</a> if it is <a href="nonexistent.html">nonexistent</a>.


</td>
</tr>
<tr>
<td markdown="1">

<a href="get-or-null.html">getOrNull</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">getOrNull</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">?</span></code></div>

Returns the encapsulated value if this instance <a href="existent.html">existent</a>
or <code>null</code> if it is <a href="nonexistent.html">nonexistent</a>.


</td>
</tr>
<tr>
<td markdown="1">

<a href="otherwise.html">otherwise</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">otherwise</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.extension.Optional$otherwise(kotlin.Function0((kotlin.Any)))/action">action</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="./index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Performs the given <a href="otherwise.html#org.mechdancer.common.extension.Optional$otherwise(kotlin.Function0((kotlin.Any)))/action">action</a> on encapsulated exception if this instance <a href="nonexistent.html">nonexistent</a>.
Returns the original <code>Optional</code> unchanged.


</td>
</tr>
<tr>
<td markdown="1">

<a href="then.html">then</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">then</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.extension.Optional$then(kotlin.Function1((org.mechdancer.common.extension.Optional.T, kotlin.Any)))/action">action</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="./index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Performs the given <a href="then.html#org.mechdancer.common.extension.Optional$then(kotlin.Function1((org.mechdancer.common.extension.Optional.T, kotlin.Any)))/action">action</a> on encapsulated value if this instance <a href="#">exist</a>.
Returns the original <code>Optional</code> unchanged.


</td>
</tr>
</tbody>
</table>

### Companion Object Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="otherwise.html">otherwise</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">otherwise</span><span class="symbol">: </span><a href="./index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">&gt;</span></code></div>

Returns a encapsulated <code>Void</code>.


</td>
</tr>
</tbody>
</table>

### Companion Object Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="otherwise.html">otherwise</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <span class="identifier">otherwise</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="./index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="otherwise.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Returns a encapsulated <code>Void</code> with specific type <a href="otherwise.html#T">T</a>.


</td>
</tr>
</tbody>
</table>

### Extension Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../kotlin.-any/cast.html">cast</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">cast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../kotlin.-any/cast.html#T"><span class="identifier">T</span></a></code></div>

Casts <a href="../kotlin.-any/cast/-this-.html">this</a> to the class represented by type parameter <a href="../kotlin.-any/cast.html#T">T</a>.
Throws an exception if the value is <code>null</code> or if it is not an instance of <a href="../kotlin.-any/cast.html#T">T</a>.


</td>
</tr>
<tr>
<td markdown="1">

<a href="../kotlin.-any/safe-cast.html">safeCast</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">.</span><span class="identifier">safeCast</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="../kotlin.-any/safe-cast.html#T"><span class="identifier">T</span></a><span class="symbol">?</span></code></div>

Casts <a href="../kotlin.-any/safe-cast/-this-.html">this</a> to the class represented by type parameter <a href="../kotlin.-any/safe-cast.html#T">T</a>.
Returns <code>null</code> if the value is <code>null</code> or if it is not an instance of <a href="../kotlin.-any/safe-cast.html#T">T</a>.


</td>
</tr>
</tbody>
</table>
