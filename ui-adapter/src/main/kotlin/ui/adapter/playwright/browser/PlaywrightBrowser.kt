package ui.adapter.playwright.browser

import com.microsoft.playwright.BrowserType
import com.microsoft.playwright.Page
import com.microsoft.playwright.Playwright
import ui.adapter.Browser
import ui.adapter.Tab

class PlaywrightBrowser : Browser {
    private lateinit var browser: com.microsoft.playwright.Browser

    private var currentPage: Page? = null

    override fun launch() {
        val launchOptions = BrowserType.LaunchOptions()
        launchOptions.headless = false
        val browserType = Playwright.create().chromium()
        browser = browserType.launch(launchOptions)
    }

    override fun close() {
        browser.close()
    }

    override fun newTab(): Tab {
        TODO("Not yet implemented")
    }

    override fun getCurrentUrl(): String {
        TODO("Not yet implemented")
    }

    override fun navigateTo(url: String) {
        if (currentPage == null) {
            currentPage = browser.newPage()
        }
        currentPage!!.navigate(url)
    }
}