package PythonSeries;
/*
 *  백준 문제 2914 : 저작권
 *  Site : https://www.acmicpc.net/problem/2914
 */
import java.util.*;
public class Solution_2914 {
    static void calc(int a , int b) {
        int result = a * b;
        result -= a;
        System.out.println(result + 1);
    }
   public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int albumSongs = sc.nextInt();
        int avg = sc.nextInt();
        sc.close();
    
        calc(albumSongs, avg);
   }
}
