package Chapter02

/**
 * 声明枚举变量的属性（r，g，b）
 */
enum class Colors(var r: Int, var g: Int, var b: Int){
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238);//这里必须要有分号

    fun rgb() = (r * 256 + g) * 256 + b           //给枚举类定义一个方法
}

fun main(args: Array<String>) {
    println(Colors.BLUE.rgb())
    //>>>255
}