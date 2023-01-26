@file:JvmName("TeaVMLauncher")

package ktx.demo.teavm

import com.github.xpenatan.gdx.backends.teavm.TeaApplicationConfiguration
import com.github.xpenatan.gdx.backends.web.WebApplication
import ktx.demo.Main

/** Launches the TeaVM/HTML application. */
fun main() {
    val config = TeaApplicationConfiguration("canvas").apply {
        width = 640
        height = 480
    }
    WebApplication(Main(), config)
}
