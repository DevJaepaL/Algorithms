package Programmers_Lv0;

public class Lv0_EvenOdd {
    public int[] solution(int[] num_list) {
        // 1. Set Array Size.
        int[] answer = new int[2];

        // 2. Get Even and Odd Number, And set element.
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        return answer;
    }
}
