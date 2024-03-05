package ui.adapter.playwright.component

import com.microsoft.playwright.Locator
import ui.adapter.component.Button

class PlaywrightButton(private val locator: Locator) : Button {

    override fun click() {
        locator.click()
    }

}