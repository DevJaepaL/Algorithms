package Programmers_Lv0;
import java.util.Stack;

public class Lv0_ControlZ {
    public int solution(String s) {
        int answer = 0;
        String[] divideStr = s.split("\\s");
        Stack<Integer> stack = new Stack<>();

        while(stack.size() != 0)
        {
            for(int i = 0; i < divideStr.length; i++) {
                    if(!divideStr[i].equals("Z")) {
                        stack.push(Integer.parseInt(divideStr[i]));
                    }

                    else {
                        if(stack.size() >= 1)
                            stack.pop();
                    }
            }

            return answer += stack.pop();
            
        }
    }
}
