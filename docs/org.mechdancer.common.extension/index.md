---
title: org.mechdancer.common.extension - 
layout: api
---



## Package org.mechdancer.common.extension

### Types

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-optional/index.html">Optional</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">class </span><span class="identifier">Optional</span><span class="symbol">&lt;</span><span class="keyword">out</span>&nbsp;<span class="identifier">T</span><span class="symbol">&gt;</span></code></div>

A discriminated union that encapsulates a value of type <a href="-optional/index.html#T">T</a>
or void represented by <code>Void</code>.


</td>
</tr>
</tbody>
</table>

### Extensions for External Classes

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="kotlin.-any/index.html">kotlin.Any</a>


</td>
<td markdown="1">

</td>
</tr>
<tr>
<td markdown="1">

<a href="kotlin.-boolean/index.html">kotlin.Boolean</a>


</td>
<td markdown="1">

</td>
</tr>
<tr>
<td markdown="1">

<a href="kotlin.-double/index.html">kotlin.Double</a>


</td>
<td markdown="1">

</td>
</tr>
<tr>
<td markdown="1">

<a href="kotlin.ranges.-closed-floating-point-range/index.html">kotlin.ranges.ClosedFloatingPointRange</a>


</td>
<td markdown="1">

</td>
</tr>
<tr>
<td markdown="1">

<a href="kotlin.ranges.-int-range/index.html">kotlin.ranges.IntRange</a>


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

<a href="check.html">check</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="check.html#T"><span class="identifier">T</span></a><span class="symbol">.</span><span class="identifier">check</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate">predicate</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="check.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="-optional/index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="check.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Returns an instance of <a href="-optional/index.html">Optional</a> encapsulated <a href="check/-this-.html">this</a> if it satisfies the given <a href="check.html#org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate">predicate</a>
or an instance of <a href="-optional/index.html">Optional</a> represented <code>void</code>, if it doesn't.


</td>
</tr>
<tr>
<td markdown="1">

<a href="to-optional.html">toOptional</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="to-optional.html#T"><span class="identifier">T</span></a><span class="symbol">.</span><span class="identifier">toOptional</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="-optional/index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="to-optional.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Returns an instance of <a href="-optional/index.html">Optional</a> encapsulated <a href="to-optional/-this-.html">this</a>.


</td>
</tr>
</tbody>
</table>
