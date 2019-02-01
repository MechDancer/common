import org.apache.log4j.Level
import org.mechdancer.common.extension.log4j.level
import org.mechdancer.common.extension.log4j.logger
import org.mechdancer.common.extension.log4j.toConsole

fun main() {
    with(logger("hello")) {
        level = Level.ALL
        toConsole()

        trace("1")
        debug("2")
        info("3")
        warn("4")
        error("5")
    }
}
