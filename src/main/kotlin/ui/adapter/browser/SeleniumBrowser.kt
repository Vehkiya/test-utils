package ui.adapter.browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class SeleniumBrowser : Browser {
    private val driver: WebDriver

    init {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe")
        val options = ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("ignore-certificate-errors");
        options.addArguments("--remote-allow-origins=*");
        driver = ChromeDriver(options)
    }

    override fun launch() {
        TODO("Not yet implemented")
    }

    override fun close() {
        driver.quit()
    }

    override fun newTab(): Tab {
        TODO("Not yet implemented")
    }

    override fun getCurrentUrl(): String {
        TODO("Not yet implemented")
    }

    override fun navigateTo(url: String) {
        driver.get(url)
    }
}