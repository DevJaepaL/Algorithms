package Programmers_Lv0;

public class Lv0_ReverseArr {
    public static int[] solution(int[] num_list) {
        int plus = 0;
        int[] answer = new int[num_list.length];
        for(int i = num_list.length - 1; i >= 0; i--) {
            answer[plus] = num_list[i];
            plus++;
        }
        return answer;
    }
}
