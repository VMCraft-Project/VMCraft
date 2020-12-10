package com.example.view

import com.example.style.Styles
import tornadofx.View
import tornadofx.addClass
import tornadofx.hbox
import tornadofx.label

class MainView : View("VMCraft") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}
