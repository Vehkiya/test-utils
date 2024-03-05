package ui.adapter.selenium.component

import org.openqa.selenium.WebElement
import ui.adapter.component.Button

class SeleniumButton(private val webElement: WebElement) : Button {
    override fun click() {
        webElement.click()
    }

}