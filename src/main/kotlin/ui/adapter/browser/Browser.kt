package ui.adapter.browser

interface Browser {

    fun launch()
    fun close()
    fun newTab(): Tab
    fun getCurrentUrl(): String
    fun navigateTo(url: String)
    // ...other common browser actions

}