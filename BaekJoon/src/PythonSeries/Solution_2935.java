package PythonSeries;
/*
 *  백준 문제 2935 : 소음
 *  Site : https://www.acmicpc.net/problem/2935
 */
import java.math.BigInteger;
import java.util.*;
public class Solution_2935 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger num0 = new BigInteger(sc.nextLine());
        String calc = sc.nextLine();
        BigInteger num1 = new BigInteger(sc.nextLine());

        if(calc.equals("*"))
            System.out.println(num0.multiply(num1));
        else
            System.out.println(num0.add(num1));

        sc.close();
    }
}
