package Programmers_Lv0;

public class Lv0_StringCalc {
    public int solution(String my_string) {
        String[] charArr = my_string.split(" ");
        int answer = Integer.parseInt(charArr[0]);
        for(int i = 1; i < charArr.length; i+=2) {
            if(charArr[i].equals("+")) {
                answer += Integer.parseInt(charArr[i + 1]);
            } else {
                answer -= Integer.parseInt(charArr[i + 1]);
            }
        }
        return answer;
    }
}
