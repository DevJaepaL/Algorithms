package Programmers_Lv0;

public class Lv0_StringCnt {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p += 1;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y += 1;
            }
        }

        boolean answer = p != y ? false : true;

        return answer;
    }
}
