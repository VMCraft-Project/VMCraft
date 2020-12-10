package com.vmcraft.setup.view

import com.vmcraft.setup.util.FXML_PATH
import javafx.scene.layout.BorderPane
import tornadofx.View
import java.io.File


class MainView : View("VMCraft") {
    private val f = File("${FXML_PATH}MainView.fxml")
    override val root: BorderPane by fxml(f.inputStream())

    //按钮的点击事件
    fun onStartBtnClicked() {
        println("开始力")
    }
}