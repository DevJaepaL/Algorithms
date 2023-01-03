package Programmers_Lv0;

public class Lv0_Programmers08 {
    public int[] solution(int[] numbers) {
        int arrLength = numbers.length;
        int[] answer = new int[arrLength]; // 배열 크기 동적 선언

        // 원소 최소,최댓값
        int elementMin = -10000;
        int elementMax = 10000;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] >= elementMin || numbers[i] <= elementMax) {
                numbers[i] = numbers[i] * 2;
                answer[i] = numbers[i];
            }
        }

        return answer;
    }
}
