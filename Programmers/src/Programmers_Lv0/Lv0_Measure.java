package Programmers_Lv0;

import java.util.ArrayList;

public class Lv0_Measure {
    public int[] solution(int n) {
        ArrayList<Integer> measure = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                measure.add(i);
            }
        }
        int[] answer = new int[measure.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = measure.get(j);
        }

        /* 다른 사람 풀이를 통해 더 효율적인 방법을 찾음.
         * return answer.stream().mapToInt(x -> x).toArray();
         */

        return answer;
    }
}
