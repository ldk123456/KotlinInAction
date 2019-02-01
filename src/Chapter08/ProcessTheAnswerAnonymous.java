package Chapter08;

import kotlin.jvm.functions.Function1;

import static Chapter08.ProcessTheAnswer.*;

/* Java */
public class ProcessTheAnswerAnonymous {
    public static void main(String[] args) {
        processTheAnswer(
                new Function1<Integer, Integer>() { //在Java代码中使用函数类型（Java 8以前）
                    @Override
                    public Integer invoke(Integer number) {
                        System.out.println(number);
                        return number + 1;
                    }
                }
        );
    }
}
