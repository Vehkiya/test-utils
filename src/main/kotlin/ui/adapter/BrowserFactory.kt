package ui.adapter

import ui.adapter.browser.Browser
import ui.adapter.browser.PlaywrightBrowser
import ui.adapter.browser.SeleniumBrowser

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