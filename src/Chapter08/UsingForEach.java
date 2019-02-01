package Chapter08;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import java.util.ArrayList;
import java.util.List;

/* Java */
public class UsingForEach {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {   //可以在Java代码总使用Kotlin标准库中的函数
            System.out.println(s);
            //>>>42
            return Unit.INSTANCE;   //必须要显式地返回一个Unit类型的值
        });
    }
}
