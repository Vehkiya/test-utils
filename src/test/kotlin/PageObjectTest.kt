import org.junit.jupiter.api.Test
import ui.adapter.BrowserFactory
import ui.adapter.BrowserFactory.BrowserFactory.DriverType
import ui.adapter.browser.Browser

class PageObjectTest {

    @Test
    fun testInit() {
        println("bla")
        val browser: Browser = BrowserFactory.createBrowser(DriverType.SELENIUM)
        browser.navigateTo("https://google.com")
        println("done")
        browser.close()
    }
}