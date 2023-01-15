/*
 *  백준 문제 2163 : 초콜릿 자르기
 *  Site : https://www.acmicpc.net/problem/2163
 */
package PythonSeries1;
import java.util.*;

public class Solution_2163 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int choco = n * m;
        int result = 0;

        for(int i = 1; i <= choco; i++) {  
            result += 1;
        }
        if(choco == 1) {
            System.out.println(0);
        }
        else
            System.out.print(result - 1);
    }
}
