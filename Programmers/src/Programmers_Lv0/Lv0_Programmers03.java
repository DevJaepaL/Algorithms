package Programmers_Lv0;
/*  코딩 테스트 입문 문제 [Lv. 0]
 *  두 수의 차
 */
public class Lv0_Programmers03 {
    public int solution(int num1, int num2) {
        int maxNum = 50000;
        int minNum = -50000;
        int answer = 0;

        if(num1 >= minNum || num1 <= maxNum || num2 >= minNum || num2 <= maxNum){
            answer = num1 - num2;
        }

        return answer;
    }
}
