package Programmers_Lv1;

import java.util.Arrays;

public class Lv1_Pokemon {
    public static int solution(int[] nums) {
        int N = nums.length / 2; // 가져갈 수 있는 포켓몬의 최대 개수
        nums = Arrays.stream(nums).distinct().toArray(); // 중복된 숫자들을 전부 제거
        /*
         * 중복 제거한 배열내에 포켓몬은 어차피 다 가져갈 수 있음.
         * 또한 N 값 또한 다 가져갈 수 있는 값이기에 둘의 값을 비교하여 작은 값을 return.
         */
        return Math.min(nums.length, N);
    }
}
