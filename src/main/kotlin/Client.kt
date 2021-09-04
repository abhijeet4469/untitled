import dependency.mathjs
import dependency.sorted
import dependency.string
import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    /*window.onload = {
        render(document.getElementById("root")) {
            child(Welcome::class) {
                attrs {
                    name = "Kotlin/JS"
                }
            }
        }
    }*/
    //console.log("Hello, Kotlin/JS!")
    println("Hello this is kotlin syntax")

    console.log("Hello, Kotlin/JS!")
    console.log(   sorted(arrayOf(1,2,3)))
    console.log(   sorted(arrayOf(3,1,2)   ))


    console.log(   string("Abhi").right(2)  )
    console.log(   string("Abhi").left(3)  )


    //var m = Math();

    //console.log(sqrt(25).toString())
    //console.log("Sqrt of : ",m.sqrt(25).toString())
    //console.log("Sqrt of : ", mathjs().sqrt(25))
    //console.log("Sqrt of : ", log(10000, 10))

    fun getStringName(name: String):String{

        return string(name).left(3);
    }
}


