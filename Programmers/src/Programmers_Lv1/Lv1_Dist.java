package Programmers_Lv1;

import java.util.ArrayList;

public class Lv1_Dist {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        /*
         * 원소 이전값과 비교하기 위한 변수. -1은
         * 해당 문제에 간섭 받지 않는 수로 초기화 해준 것이다.
         */
        int checkValue = -1;

        for (int i : arr) {
            // 현재 원소 내부의 값이 이전 값과 같지 않을 경우만 원소 추가
            if (i != checkValue) {
                arrList.add(i);
                checkValue = i;
            }
        }
        int[] answer = new int[arrList.size()];
        for (int i : answer) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
