import org.junit.jupiter.api.Test
import ui.adapter.Browser
import ui.adapter.BrowserFactory
import ui.adapter.BrowserFactory.BrowserFactory.DriverType

class PageObjectTest {

    @Test
    fun testInit() {
        val browser: Browser = BrowserFactory.createBrowser(DriverType.SELENIUM)
        browser.launch()
        browser.navigateTo("https://google.com")
        println("done")
        Thread.sleep(3000)
        browser.close()
    }
}