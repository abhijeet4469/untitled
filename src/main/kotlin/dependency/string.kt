package dependency

@JsModule("string")
@JsNonModule
//external fun stringAbhi(a: String): String

external class string(a: String) {

    fun right(right: Int): String
    fun left(right: Int): String
}