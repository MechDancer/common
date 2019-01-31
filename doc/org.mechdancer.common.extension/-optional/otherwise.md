---
title: Optional.otherwise - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.extension</a> / <a href="index.html">Optional</a> / <a href="./otherwise.html">otherwise</a></div>

# otherwise

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="identifier">otherwise</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.extension.Optional$otherwise(kotlin.Function0((kotlin.Any)))/action">action</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Performs the given <a href="otherwise.html#org.mechdancer.common.extension.Optional$otherwise(kotlin.Function0((kotlin.Any)))/action">action</a> on encapsulated exception if this instance <a href="nonexistent.html">nonexistent</a>.
Returns the original <code>Optional</code> unchanged.

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">val </span><span class="identifier">otherwise</span><span class="symbol">: </span><a href="index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html"><span class="identifier">Any</span></a><span class="symbol">?</span><span class="symbol">&gt;</span></code></div>

Returns a encapsulated <code>Void</code>.

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <span class="identifier">otherwise</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="otherwise.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Returns a encapsulated <code>Void</code> with specific type <a href="otherwise.html#T">T</a>.

</div>
