package Programmers_Lv0;

public class Lv0_Medical {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        /* n번째 인덱스 값과 나머지 값들을 비교하며
         * n번째 인덱스를 제외한 나머지 인덱스가 크면 +1
         */
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            
            answer[i]++; // 0이라는 값이 인덱스에 존재하면 안되기에 +1
        }
        
        return answer;
    }
}
