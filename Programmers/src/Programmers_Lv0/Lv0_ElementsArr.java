package Programmers_Lv0;

import java.util.ArrayList;

public class Lv0_ElementsArr {
    public int[] solution(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                newArr.add(arr[i]);
            }
        }
        int[] answer = new int[newArr.size()];
        for (int i : answer) {
            answer[i] = newArr.get(i);
        }
        return answer;
    }
}
