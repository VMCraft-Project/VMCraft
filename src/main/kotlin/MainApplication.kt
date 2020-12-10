package com.example

import com.example.style.Styles
import com.example.view.MainView
import tornadofx.App
import tornadofx.launch

class MainApplication : App(MainView::class, Styles::class)

fun main(args: Array<String>) {
    launch<MainApplication>(args)
}