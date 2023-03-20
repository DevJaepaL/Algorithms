package Programmers_Lv0;

public class Lv0_Height {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) {
                answer++;
            }
        }
        return answer;
    }
}
