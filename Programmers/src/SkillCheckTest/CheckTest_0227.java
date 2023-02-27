package SkillCheckTest;

import java.util.ArrayList;

public class CheckTest_0227 {
    public String solution(String[] seoul) {
        int findNum;
        for(findNum = 0; findNum < seoul.length; findNum++) {
            if(seoul[findNum].contains("Kim"))
                break;
        }
        String answer = "김서방은 " + findNum+"에 있다";
        return answer;
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (long)x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        long[] n = solution(-1000, 500);
        System.out.println(n[499]);
    }
}
