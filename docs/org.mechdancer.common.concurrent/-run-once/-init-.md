---
title: RunOnce.<init> - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">org.mechdancer.common.concurrent</a> / <a href="index.html">RunOnce</a> / <a href="./-init-.html">&lt;init&gt;</a></div>

# &lt;init&gt;

<div class="signature"><code><span class="identifier">RunOnce</span><span class="symbol">(</span><span class="parameterName" id="org.mechdancer.common.concurrent.RunOnce$<init>(kotlin.Boolean, kotlin.Function1((org.mechdancer.common.concurrent.RunOnce.T, org.mechdancer.common.concurrent.RunOnce.R)))/strictOnce">strictOnce</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a>&nbsp;<span class="symbol">=</span>&nbsp;false<span class="symbol">, </span><span class="parameterName" id="org.mechdancer.common.concurrent.RunOnce$<init>(kotlin.Boolean, kotlin.Function1((org.mechdancer.common.concurrent.RunOnce.T, org.mechdancer.common.concurrent.RunOnce.R)))/action">action</span><span class="symbol">:</span>&nbsp;<span class="symbol">(</span><a href="index.html#T"><span class="identifier">T</span></a><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="index.html#R"><span class="identifier">R</span></a><span class="symbol">)</span></code></div>

计算一次

### Parameters

<code>strictOnce</code> - 严格一次。若为真，即使第一次计算失败产生异常也不再计算

<code>action</code> - 计算方法