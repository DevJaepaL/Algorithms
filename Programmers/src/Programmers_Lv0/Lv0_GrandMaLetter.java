package Programmers_Lv0;
/*
 * Programmers 코딩 테스트 입문 : 편지
 * Site : https://school.programmers.co.kr/learn/courses/30/lessons/120898
 */
public class Lv0_GrandMaLetter {
    public int solution(String message) {
        int answer = 0;
        for(int i = 0; i <= message.length(); i++) {
            answer++;
        }       
        
        return answer * 2;
    }
}
