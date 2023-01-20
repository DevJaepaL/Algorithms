package PythonSeries1;

import java.util.*;

/*
 *  백준 문제 1789 : 수들의 합
 *  Site : https://www.acmicpc.net/problem/1789
 */
public class Solution_1789 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        sc.nextLine();
        sc.close();
        
        long sum = 0;
        int cnt = 0;

        for(int i = 1; i <= input; i++) {
            sum += i;
            cnt++;
            if(sum > input) {
                cnt--;
                break;
            }
        }

        System.out.print(cnt);
    }
}
