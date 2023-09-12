package Programmers_Lv1;
import java.util.ArrayList;
import java.util.Collections;

public class Lv1_Honor {
    // k = 명예의 전당에 들 수 있는 개수
    // score = 가수가 나온 회수
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {

            // 명예의 전당에 자리가 남을 경우에는 최하 점수를 배열에 등록한다.
            // 또한 continue 키워드를 통해 해당 조건이 만족할 때 까지 계속 반복
            if(tempList.size() < k) {
                tempList.add(score[i]);
                Collections.sort(tempList);
                answer[i] = tempList.get(0);
                continue;
            }

            // 명예의 전당에 공백이 없을 경우의 처리
            if(tempList.size() == k) {
                int lowScore = tempList.get(0);
                // 최하 점수보다 높은 값이 존재할 경우 최하 점수 값을 삭제한다.
                if(lowScore < score[i]) {
                    tempList.remove(0);
                    tempList.add(score[i]);
                    Collections.sort(tempList);
                }

                // 최하 점수 값을 정답에 등록.
                answer[i] = tempList.get(0);
            }
        }        

        return answer;
    }
}