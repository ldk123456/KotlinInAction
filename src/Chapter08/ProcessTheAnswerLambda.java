package Chapter08;

import static Chapter08.ProcessTheAnswer.*;

/* Java */
public class ProcessTheAnswerLambda {
    public static void main(String[] args) {
        processTheAnswer(number -> number + 1);
        //>>>43
    }
}
