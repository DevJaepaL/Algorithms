package Programmers_Lv0;

import java.util.Arrays;

class Lv0_SortString {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] strArr = my_string.toCharArray();
        Arrays.sort(strArr);
        return my_string = new String(strArr);
    }
}