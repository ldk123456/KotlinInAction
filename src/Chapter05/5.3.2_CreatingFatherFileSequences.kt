package Chapter05.CreatingFatherFileSequences

import java.io.File

fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main(args: Array<String>) {
    val file = File("/User/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
    //>>>true
}