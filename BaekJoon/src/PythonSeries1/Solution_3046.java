/*
 *  백준 문제 3046 : R2
 *  Site : https://www.acmicpc.net/problem/3046
 */
package PythonSeries1;
import java.util.*;

public class Solution_3046 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int s = sc.nextInt();
        int result = (s * 2) - r1;

        System.out.println(result);
        sc.close();
    }
}
