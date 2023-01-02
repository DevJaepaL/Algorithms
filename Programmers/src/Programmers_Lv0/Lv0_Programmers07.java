package Programmers_Lv0;

public class Lv0_Programmers07 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int minNum = 0;
        int maxNum = 1000;
        int result0 = 0;
        int result1 = 0;
        int irreFraction = 1; // 최소공배수
        int[] answer = {result0, result1};
        
        if(denum1 >= minNum || denum1 <= maxNum || num1 >= minNum || num1 <= maxNum ||
           denum2 >= minNum || denum2 <= maxNum || num2 >= minNum || num2 <= maxNum) 
           {
                    int parNum  = num1 * num2; // 분모 계산.
                    int subNum = denum1 * num2 + denum2 * num1; // 분자 계산 (분자1 * 분모2 + 분자2 * 분모1)

                    // 최소공배수를 계산한 결과의 분자 크기까지 반복
                    for(int i = 1; i <= subNum; i++){
                        // 분자,분모 크기의 나머지 값이 0일 경우 최소공배수 발견.
                        if(parNum % i == 0 && subNum % i == 0){
                            irreFraction = i;
                            answer[0] = subNum / irreFraction; // 분자 결과 값 / 최소공배수
                            answer[1] = parNum / irreFraction; // 분모 결과 값 / 최소공배수
                        }
                    }
                }
        
        return answer;
    }
}
