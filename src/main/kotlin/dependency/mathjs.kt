package dependency

@JsModule("mathjs")
@JsNonModule
//external fun sqrt(a: Int): Int
//external fun log(a: Int, b: Int): Int

//external class Mathjs(a: Int)

external class mathjs() {

    fun sqrt(value: Int): Int
    // etc
}
