package Programmers_Lv0;

public class Lv0_NumberCalc {
    public int solution(int n) {
        int answer = 0;
        while(n > 0)
        {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
