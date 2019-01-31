---
title: check - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="index.html">org.mechdancer.common.extension</a> / <a href="./check.html">check</a></div>

# check

<div class="signature"><code><span class="keyword">inline</span> <span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span><span class="symbol">&gt;</span> <a href="check.html#T"><span class="identifier">T</span></a><span class="symbol">.</span><span class="identifier">check</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate">predicate</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="check.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="-optional/index.html"><span class="identifier">Optional</span></a><span class="symbol">&lt;</span><a href="check.html#T"><span class="identifier">T</span></a><span class="symbol">&gt;</span></code></div>

Returns an instance of <a href="-optional/index.html">Optional</a> encapsulated <a href="check/-this-.html">this</a> if it satisfies the given <a href="check.html#org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate">predicate</a>
or an instance of <a href="-optional/index.html">Optional</a> represented <code>void</code>, if it doesn't.

如果 <a href="check/-this-.html">this</a> 满足给定的 <a href="check.html#org.mechdancer.common.extension$check(org.mechdancer.common.extension.check.T, kotlin.Function1((org.mechdancer.common.extension.check.T, kotlin.Boolean)))/predicate">predicate</a> 则返回一个封装了 <a href="check/-this-.html">this</a> 的 <a href="-optional/index.html">Optional</a> 实例，
否则返回代表<code>空</code>的 <a href="-optional/index.html">Optional</a> 实例。

