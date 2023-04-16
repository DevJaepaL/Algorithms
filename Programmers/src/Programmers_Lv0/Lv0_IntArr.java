package Programmers_Lv0;

public class Lv0_IntArr {
    public static int[] solution(long n) {
        // 1. Copy the Parameter Value
        Long conversionNumber = n;

        // 2. Set Array Index
        int index = 0;
        while (n > 0) {
            n /= 10;
            index++;
        }
        int[] answer = new int[index];

        // 3. Push Array Element.
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (conversionNumber % 10);
            conversionNumber /= 10;
        }

        return answer;
    }
}
