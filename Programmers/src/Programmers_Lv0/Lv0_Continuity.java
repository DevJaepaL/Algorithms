package Programmers_Lv0;

public class Lv0_Continuity {
    /*
     * 1. 중간 값은 항상 총합 값과 연속된 수(num)를 나눴을 때의 값이 나온다.
     * 2. 나머지 값은 총합과 num을 나눴을 때 나머지가 0일 경우 num / 2
     * 아닐 경우 num / 2 - 1 한 값이다.
     * 3. 이제 중간 값 - 나머지 값을 빼주면 첫번째 숫자 값이 나온다.
     */
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int midNum = total / num;
        int subNum = total % num == 0 ? num / 2 : num / 2 - 1;
        int startNum = midNum - subNum;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = startNum + i;
        }
        return answer;
    }
}
