package io.github.domi04151309.powerapp.shortcuts

import io.github.domi04151309.powerapp.PowerOptions
import io.github.domi04151309.powerapp.R

class ShutdownActivity : ShortcutActivity() {

    override fun getShortcutName(): String {
        return resources.getString(R.string.Shutdown)
    }

    override fun onOpened() {
        PowerOptions(this).shutdown()
    }
}
