package Programmers_Lv0;

public class Lv0_StringPush {
    public int solution(String A, String B) {
        int answer = 0;
        String copyStr = A;

        for(int i = 0; i < A.length(); i++) {
            if(copyStr.contains(B)) {
                return answer;
            }

            String first = copyStr.substring(copyStr.length() - 1);
            copyStr = first + copyStr.substring(0, copyStr.length() - 1);
        }
        return -1;
    }
}
