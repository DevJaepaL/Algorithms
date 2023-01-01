package Programmers_Lv0;
/*  코딩 테스트 입문 문제 [Lv. 0]
 *  두 수의 나눗셈
 *  제한 사항 : 0 <= num1 <= 100
 *            0 <= num2 <= 100  
 *  해결 방법 : 타입캐스팅이 요구 된다.
 */
public class Lv0_Programmers05 {
    public int solution(int num1, int num2) {
        int minNum = 0;
        int maxNum = 100;
        int answer = 0;

        if(num1 >= minNum || num1 <= maxNum || num2 >= minNum || num2 <= maxNum) {
            float temp = (float)num1 / (float)num2;
            System.out.println(temp);
            answer = (int) (temp * 1000);
        }

        return answer;
    }
}
