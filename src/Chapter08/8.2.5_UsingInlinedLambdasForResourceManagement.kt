package Chapter08.UsingInlinedLambdasForResourceManagement

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromfile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->    //构建BufferedReader，调用use函数，传递一个lambda执行文件操作
        return br.readLine()    //从函数中返回文件的一行
    }
}