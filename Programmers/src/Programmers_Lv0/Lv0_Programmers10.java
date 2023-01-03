package Programmers_Lv0;
import java.util.Arrays;
/*
 *  중앙 값 구히기 
 */
public class Lv0_Programmers10 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
