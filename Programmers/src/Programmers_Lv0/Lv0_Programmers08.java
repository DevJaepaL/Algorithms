package Programmers_Lv0;

public class Lv0_Programmers08 {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[1000]; // 인덱스가 1000 크기의 배열 선언.

        // 원소 최소,최댓값
        int elementMin = -10000;
        int elementMax = 10000;

        for(int i = 0; i < answer.length; i++){
            if(numbers[i] >= elementMin || numbers[i] <= elementMax) {
                numbers[i] = numbers[i] * 2;
                answer[i] = numbers[i];
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        System.out.println(solution(1,2,3,4));
    }
}
