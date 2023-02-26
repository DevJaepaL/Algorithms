package Programmers_Lv0;

public class Lv0_ReverseStr {
    public String solution(String my_string) {
        char[] str = my_string.toCharArray();
        char[] reversed = new char[str.length];
        for(int i = 0; i < str.length; i++) {
            reversed[str.length - 1 - i] = str[i];
        }
        String answer = new String(reversed);
        return answer;
    }
}
