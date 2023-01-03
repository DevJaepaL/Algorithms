package Programmers_Lv0;

import java.util.ArrayList;

/*
 *   Programmers_Lv0 : 짝수는 싫어요
 */
public class Lv0_Programmers12 {
    public ArrayList<Integer> solution(int n) {
        int minNum = 1;
        int maxNum = 100;
        ArrayList<Integer> answer = new ArrayList<Integer>();

        if(minNum <= n || n <= maxNum) {
            for(int i = 1; i <= n; i++) {
                    if(i % 2 == 1)
                        answer.add(i);
                }
            }

        return answer;
    }
}
