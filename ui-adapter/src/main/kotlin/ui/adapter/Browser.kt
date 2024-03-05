package ui.adapter

import ui.adapter.component.Component
import ui.adapter.locator.Locator
import ui.adapter.playwright.browser.PlaywrightBrowser
import ui.adapter.selenium.browser.SeleniumBrowser

interface Browser {

    fun launch()
    fun close()
    fun newTab(): Tab
    fun getCurrentUrl(): String
    fun navigateTo(url: String)
    // ...other common browser actions

}

interface Tab {
    fun close()
    fun findComponent(locator: Locator): Component
    fun findComponents(locator: Locator): List<Component>
}

class BrowserFactory {

    companion object BrowserFactory {
        enum class DriverType { SELENIUM, PLAYWRIGHT }

        fun createBrowser(driverType: DriverType): Browser {
            return when (driverType) {
                DriverType.SELENIUM -> SeleniumBrowser()
                DriverType.PLAYWRIGHT -> PlaywrightBrowser()
            }
        }
    }
}