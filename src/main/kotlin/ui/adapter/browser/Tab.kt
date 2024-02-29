package ui.adapter.browser

import ui.adapter.locator.Locator
import ui.adapter.component.Component

interface Tab {
    fun close()
    fun findComponent(locator: Locator): Component
    fun findComponents(locator: Locator): List<Component>
}