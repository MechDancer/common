import org.apache.log4j.Level
import org.mechdancer.common.extension.log4j.*

fun main() {
    with(logger("hello")) {
        level = Level.ALL
        toConsole(pattern(Locate))

        trace("1")
        debug("2")
        info("3")
        warn("4")
        error("5")
    }
}
