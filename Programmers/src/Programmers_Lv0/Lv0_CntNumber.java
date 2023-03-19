package Programmers_Lv0;

class Lv0_CntNumber {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                answer++;
        }
        return answer;
    }
}