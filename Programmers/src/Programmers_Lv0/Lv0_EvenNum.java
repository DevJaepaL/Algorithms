package Programmers_Lv0;

public class Lv0_EvenNum {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}
