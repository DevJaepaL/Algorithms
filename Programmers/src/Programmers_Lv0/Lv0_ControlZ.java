package Programmers_Lv0;
import java.util.Stack;
/*
 * Programmers Lv.0 : 컨트롤 제트
 * Site : https://school.programmers.co.kr/learn/courses/30/lessons/120853
 * 해결 방식  : Stack 자료구조 이용
 */
public class Lv0_ControlZ {
    public int solution(String s) {
        int answer = 0;
        String[] divideStr = s.split("\\s");
        Stack<Integer> stack = new Stack<>();

        
        for(int i = 0; i < divideStr.length; i++) {
            if(!divideStr[i].equals("Z")) {
                stack.push(Integer.parseInt(divideStr[i]));
            }

            else
                if(stack.size() >= 1)
                    stack.pop();
        }

        while(stack.size() != 0)
            answer += stack.pop();

        return answer;
    }
}
