package Programmers_Lv0;

public class Lv0_Programmers11 {
    public int solution(int[] array) {
        int answer = 0;
        int arrIndexMaxOne = 1; 
        int arrayLen = 0; // 

        // 배열에 값이 하나일 경우 그대로 값 리턴
        if(array.length == arrIndexMaxOne) {
            answer = array[0];
        }

        else {
            for(int i = 0; i < array.length; i++) {
                arrayLen = array[i];
            }

            int[] cnt = new int[arrayLen + 1]; // 매개변수의 배열 크기 + 1
            for(int i = 0; i < array.length; i++) {
                cnt[array[i]]++; 
            }

            int cntMax = 0;
            for(int j = 0; j < cnt.length; j++) {
                if(cntMax < cnt[j]) {
                    cntMax = cnt[j];
                    answer = j;
                }
            }
            
            int dupli = 0;
            for(int k = 0; k < cnt.length; k++) {
                if(cntMax == cnt[k]) {
                    dupli++;
                }
            }
            
            if(dupli != 1) // 중복 값 여러 개이면 -1
            answer = -1;
        }
        
        return answer;
    }
}
