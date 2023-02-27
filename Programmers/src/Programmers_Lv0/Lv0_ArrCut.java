package Programmers_Lv0;

class Lv0_ArrCut {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int arrIndex = 0;
        for(int i = num1; i <= num2; i++) {
            answer[arrIndex] = numbers[i];
            arrIndex++;
        }
        return answer;
    }    
}