package Programmers_Lv0;

public class Lv0_Count7 {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            /* 1. 정수 파라미터 배열을 문자열 배열로 변환해준다.
             *  2. 문자열 배열의 저장된 문자들을 각자 분리해 새로운 문자열 배열로 생성.
             *  3. 각 문자들이 담긴 배열을 기준으로 루프하여 7이 포함 돼있는지 체크한 후 answer 값 증가.
             *  4. 정수 파라미터의 배열까지 반복.
             */
            String arrNum = Integer.toString(i);
            String[] changeArr = arrNum.split("");
            for (int j = 0; j < changeArr.length; j++) {
                if (changeArr[j].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
