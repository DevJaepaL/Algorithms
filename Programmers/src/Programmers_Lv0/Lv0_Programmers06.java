package Programmers_Lv0;
/*  코딩 테스트 입문 문제 [Lv. 0]
 *  숫자 비교하기
 *  제한 사항 : 0 <= num1 <= 10,000
 *            0 <= num2 <= 10,000  
 */
public class Lv0_Programmers06 {
    public int solution(int num1, int num2) 
    {
        int minNum = 0;
        int maxNum = 10000;
        int answer = 0;

        if(num1 >= minNum || num1 <= maxNum || num2 >= minNum || num2 <= maxNum) {
            if(num1 == num2)
                answer = 1;
            else
                answer = -1;
        }
        return answer;
    }
}
