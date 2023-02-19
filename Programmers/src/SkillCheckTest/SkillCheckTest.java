package Programmers_Lv0;

import java.util.ArrayList;
import java.util.Collections;

public class SkillCheckTest {
    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answerArr.add(arr[i]);
            }
        }
        
        Collections.sort(answerArr);
        int[] answer = {};
        if(answerArr.isEmpty()) {
            answer[0] = -1;
        } else {     
            answer = new int[answerArr.size()];
            for(int i = 0; i < answerArr.size(); i++) {
                answer[i] = answerArr.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        System.out.println(solution(arr, divisor));
    }
}