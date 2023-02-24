package Programmers_Lv0;

public class Lv0_Index {
    public String solution(String my_string, int num1, int num2) {
        final char f = my_string.charAt(num1);
        final char s = my_string.charAt(num2);
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, s);
        sb.setCharAt(num2, f);
        my_string = sb.toString();

        return my_string;   
    }
}
