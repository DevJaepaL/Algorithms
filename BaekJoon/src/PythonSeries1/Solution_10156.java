package PythonSeries1;
/*
 *  백준 문제 10156 : 과자
 *  Site : https://www.acmicpc.net/problem/10156
 */
import java.util.*;
public class Solution_10156 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int cnt = sc.nextInt();
        int money = sc.nextInt();
        sc.close();
        if((price * cnt) - money <= 0)
            System.out.print(0);
        else
            System.out.print((price * cnt) - money);
    }
}
