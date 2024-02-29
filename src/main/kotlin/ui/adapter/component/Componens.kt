package ui.adapter.component

interface Component

interface Button : Component {
    fun click()
}

interface InputText : Component {
    fun type(text: String)
    fun clear()
    // ...
}

interface Label : Component {
    fun getText(): String
    // ....
}