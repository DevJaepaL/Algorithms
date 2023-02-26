package Programmers_Lv0;

public class Lv0_ArrAvg {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i : numbers) {
            answer += i;
        }
        return answer / numbers.length;
    }
}
