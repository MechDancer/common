package org.mechdancer.common.extension.log4j

import org.apache.log4j.LogManager
import org.mechdancer.common.concurrent.RunOnce
import java.io.File
import java.nio.file.Path
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread

/** 默认日志文件夹路径 */
internal val DefaultPath = System.getProperty("user.dir")

// 日志路径设值器
private val logPathSetter =
    RunOnce { path: String ->
        File(path, "log")
            .also { if (!it.exists()) it.mkdir() }
            .toPath()
            .toString()
    }

/**
 * 日志路径
 * 只能设置一次
 */
var logPath: String
    get() = logPathSetter(DefaultPath)!!
    set(value) {
        logPathSetter(value)
    }

// log文件夹下创建本次运行的文件夹
internal val currentLogPath: Path by lazy {
    // 创建文件夹 => 创建了文件 => 需要保证全部输出
    Runtime
        .getRuntime()
        .addShutdownHook(thread(start = false) { LogManager.shutdown() })
    // 创建文件夹
    File(logPath, SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Date()))
        .also { if (!it.exists()) it.mkdir() }
        .toPath()
}
