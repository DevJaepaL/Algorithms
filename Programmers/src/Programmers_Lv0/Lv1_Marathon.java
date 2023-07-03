package Programmers_Lv0;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Lv1_Marathon {
    public String solution(String[] participant, String[] completion) {
        LinkedList<String> runner = new LinkedList<>(Arrays.asList(participant));
        Collections.sort(runner);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (runner.get(0).equals(completion[i])) {
                runner.remove(0);
            } else if (runner.get(1).equals(completion[i])) {
                runner.remove(1);
            }
        }

        String answer = runner.get(0);
        return answer;
    }
}
