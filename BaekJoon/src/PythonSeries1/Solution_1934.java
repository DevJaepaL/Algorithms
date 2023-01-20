package PythonSeries1;
/*
 *  백준 문제 1934 : 최소공배수
 *  Site : https://www.acmicpc.net/problem/1934
 */
import java.util.*;

public class Solution_1934 {
    static void lcm(String str) {
        String[] numArr = str.split(" ");
        int lcdNum0 = Integer.parseInt(numArr[0]);
        int lcdNum1 = Integer.parseInt(numArr[1]);
        int maxNum = (lcdNum0 > lcdNum1) ? lcdNum0 : lcdNum1; // 최대 값 구하기
        int lcm = 0;
        for(int i = 1; i <= maxNum; i++) {
                if(lcdNum0 % i == 0 && lcdNum1 % i == 0) {
                        int gcd = i; // 두 수의 최대공배수
                        System.out.println(gcd);
                        lcm = lcdNum0 * lcdNum1 / gcd;
                    }
                }

            System.out.println(lcm);
        }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < testNum; i++) {
            String input = sc.nextLine();
            lcm(input);
        }
        sc.close();
    }
}
