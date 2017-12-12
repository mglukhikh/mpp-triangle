package test

actual fun baz(my: My, your: Your, his: His) {
    println(my)
}

val my: My? get() = null

fun main(args: Array<String>) {
    baz(my!!, Your(), His())
}