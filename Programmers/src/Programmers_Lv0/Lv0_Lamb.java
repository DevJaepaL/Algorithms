package Programmers_Lv0;

public class Lv0_Lamb {
    public int solution(int n, int k) {
        int answer = (12000 * n) + (k * 2000);
        return answer -= 2000 * (n / 10);
    }   
}
