package com.vmcraft.setup

import com.vmcraft.setup.view.MainView
import tornadofx.App
import tornadofx.launch

class MainApplication : App(MainView::class)

fun main(args: Array<String>) {
    launch<MainApplication>(args)
}