/*
 *  코딩 테스트 연습 문제 : 구슬을 나누는 경우의 수
 *  Site : https://school.programmers.co.kr/learn/courses/30/lessons/120840
 */
package Programmers_Lv0;
import java.math.BigInteger;

 public class Lv0_BallsFactorial {
    public BigInteger solution(int balls, int share) {
        /*  경우의 수 연산 
         *  balls! / (balls - share)! * share!
         *  여기서 '!'는 팩토리얼을 의미한다.
         */
        BigInteger answer = facto(balls);
        BigInteger downNum0 = facto(balls - share).multiply(facto(share));
        return answer.divide(downNum0);
    }  

    public BigInteger facto(int n) {
        BigInteger factoNum = BigInteger.ONE;
    
        for(int i = 1; i <= n; i++) {
            factoNum = factoNum.multiply(new BigInteger(Integer.toString(i)));
        }

        return factoNum;
    }
}