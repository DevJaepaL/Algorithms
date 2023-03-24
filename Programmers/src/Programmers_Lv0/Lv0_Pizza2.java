package Programmers_Lv0;

public class Lv0_Pizza2 {
    public int solution(int n) {
        int answer = 1;
        while (answer * 6 % n != 0) {
            answer++;
        }
        return answer;
    }
}
