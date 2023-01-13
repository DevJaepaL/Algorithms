package Programmers_Lv0;
/*
 * Programmers 코딩 테스트 입문 : 아이스 아메리카노
 * Site : https://school.programmers.co.kr/learn/courses/30/lessons/120819
 */
public class Lv0_IceAmericano {
    public int[] solution(int money) {
        int cnt = money / 5500; // 구매 개수
        int temp = money % 5500; // 거스름돈
        int[] answer = {cnt, temp};
    
        return answer;
    }
}
