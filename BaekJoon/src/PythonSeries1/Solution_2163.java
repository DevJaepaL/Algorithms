/*
 *  백준 문제 2163 : 초콜릿 자르기
 *  Site : https://www.acmicpc.net/problem/2163
 */
import java.util.*;
public class Solution_2163 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int choco = n * m;

        System.out.print(choco - 1);

        if(choco == 1) {
            System.out.print(0);
        }

        sc.close();
    }
}
