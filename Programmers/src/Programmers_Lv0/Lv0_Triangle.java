package Programmers_Lv0;

import java.util.Arrays;

class Lv0_Triangle {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int maxVal = sides[2];
        int remainVal = sides[0] + sides[1];
        return remainVal <= maxVal ? 2 : 1;
    }
}
