---
title: org.mechdancer.common.extension.log4j - 
layout: api
---



## Package org.mechdancer.common.extension.log4j

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-locate.html">Locate</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">Locate</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="-message.html">Message</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">Message</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="-pattern-header.html">PatternHeader</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">PatternHeader</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="-stamp.html">Stamp</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">Stamp</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="level.html">level</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">&lt;ERROR CLASS&gt;</span><span class="symbol">.</span><span class="identifier">level</span><span class="symbol">: </span><span class="identifier">&lt;ERROR CLASS&gt;</span></code></div>

读取/设置日志级别


</td>
</tr>
<tr>
<td markdown="1">

<a href="log-path.html">logPath</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">logPath</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

日志路径
只能设置一次


</td>
</tr>
<tr>
<td markdown="1">

<a href="underlying.html">underlying</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">&lt;ERROR CLASS&gt;</span><span class="symbol">.</span><span class="identifier">underlying</span><span class="symbol">: </span><span class="identifier">&lt;ERROR CLASS&gt;</span></code></div>

在log4j中获取日志器


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="pattern.html">pattern</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pattern</span><span class="symbol">(</span><span class="keyword">vararg</span> <span class="parameterName" id="org.mechdancer.common.extension.log4j$pattern(kotlin.Array((kotlin.String)))/topics">topics</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">&lt;ERROR CLASS&gt;</span></code></div>

构造一个模式


</td>
</tr>
<tr>
<td markdown="1">

<a href="to-console.html">toConsole</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">&lt;ERROR CLASS&gt;</span><span class="symbol">.</span><span class="identifier">toConsole</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.extension.log4j$toConsole(, )/layout">layout</span><span class="symbol">:</span>&nbsp;<span class="identifier">&lt;ERROR CLASS&gt;</span>&nbsp;<span class="symbol">=</span>&nbsp;DefaultLayout<br/><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">&lt;ERROR CLASS&gt;</span></code></div>

设置日志输出到控制台


</td>
</tr>
<tr>
<td markdown="1">

<a href="to-file.html">toFile</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">&lt;ERROR CLASS&gt;</span><span class="symbol">.</span><span class="identifier">toFile</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.extension.log4j$toFile(, , kotlin.Int)/layout">layout</span><span class="symbol">:</span>&nbsp;<span class="identifier">&lt;ERROR CLASS&gt;</span>&nbsp;<span class="symbol">=</span>&nbsp;DefaultLayout<span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="org.mechdancer.common.extension.log4j$toFile(, , kotlin.Int)/period">period</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a>&nbsp;<span class="symbol">=</span>&nbsp;0x100000<br/><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">&lt;ERROR CLASS&gt;</span></code></div>

设置日志输出到文件


</td>
</tr>
</tbody>
</table>
