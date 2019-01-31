# common
[ ![Download](https://api.bintray.com/packages/mechdancer/maven/common-all/images/download.svg) ](https://bintray.com/mechdancer/maven/common-all/_latestVersion)
[![Build Status](https://travis-ci.com/MechDancer/common.svg?branch=master)](https://travis-ci.com/MechDancer/common)

Mechdancer common is a set of functions and utilities for [kotlin](http://kotlinlang.org) project, 
including collection, concurrent, extension and extension for [log4j](https://logging.apache.org/log4j/2.x/).

## Overview

* collection
    * `Map2D`   `Map2D` is a 2-key data container, and it's a kind of 2D table.
    * `Trie`    `Trie` is a data structure for word, including searching, frequency counting and so more.

* concurrent
    * `RunOnce`    `RunOnce` is similar to a `(T)->R?` (`Funciton1`), 
    but it ensures that it will only be called once in concurrent environment.
    * `RestartableTimer` `RestartableTimer` is a kind of timer, it can work periodically. More importantly, it can be 
    *suppressed*, that means current time counting will be discard and start a new cycle.

* extension
    * Boolean
    * Cast
    * Optional
    * Range
    
* extension for [log4j](https://logging.apache.org/log4j/2.x/)
    * `toConsole`
    * `toFile`
    * *path* designating
    * *pattern* construction

## Using in your projects

This library is published to [JCenter](https://bintray.com/mechdancer/maven/common-all).  

You can use all-in-one package:

### Maven

```xml
<repositories>
   <repository>
     <id>jcenter</id>
     <name>JCenter</name>
     <url>https://jcenter.bintray.com/</url>
   </repository>
</repositories>

<dependency>
  <groupId>org.mechdancer</groupId>
  <artifactId>common-all</artifactId>
  <version>v0.1.0</version>
  <type>pom</type>
</dependency>
```

### Gradle

```groovy
repositories {
    jcenter()
}
dependencies{
    compile 'org.mechdancer:common-all:v0.1.0'
}
```

However, you certainly can use every module independently. Here is an example for [common-extension](/common-extension):

### Maven

```xml
<repositories>
   <repository>
     <id>jcenter</id>
     <name>JCenter</name>
     <url>https://jcenter.bintray.com/</url>
   </repository>
</repositories>

<dependency>
  <groupId>org.mechdancer</groupId>
  <artifactId>common-extension</artifactId>
  <version>v0.1.0</version>
  <type>pom</type>
</dependency>
```

### Gradle

```groovy
repositories {
    jcenter()
}
dependencies{
    compile 'org.mechdancer:common-extension:v0.1.0'
}
```