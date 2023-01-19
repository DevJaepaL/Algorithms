package PythonSeries1;
/*
 *  백준 문제 11653 : 소인수분해
 *  Site : https://www.acmicpc.net/problem/11653
 */
import java.util.*;
public class Solution_11653 {
    static void prime(int num) {
        for(int prime = 2; prime <= num; prime++) {
            while(num % prime == 0) {
                num /= prime;
                System.out.println(prime);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        prime(input);
    }
}
