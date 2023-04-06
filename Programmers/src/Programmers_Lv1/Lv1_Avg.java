package Programmers_Lv1;

public class Lv1_Avg {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) {
            answer += i;
        }
        return answer / arr.length;
    }    
}
