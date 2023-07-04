package Programmers_Lv0;

public class Lv0_StringWord {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
