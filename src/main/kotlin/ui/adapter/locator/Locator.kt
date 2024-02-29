package ui.adapter.locator

interface Locator

class ById(val id: String) : Locator
class ByCssSelector(val selector: String) : Locator
class ByXPath(val xpath: String) : Locator