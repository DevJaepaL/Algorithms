package Programmers_Lv1;

public class Lv1_Yaksu {
    public static int yaksu(int y) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(y); i++) {
            if (y % i == 0) {
                cnt++;
                if (i * i != y) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int solution(int left, int right) {
        int answer = left;
        for (int i = left; i < right; i++) {
            int countPrimeNum = yaksu(i);
            if (countPrimeNum % 2 == 0) {
                answer += i + 1;
            } else {
                answer -= i + 1;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        System.out.println(yaksu(16));
    }
}
