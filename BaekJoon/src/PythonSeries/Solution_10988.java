package PythonSeries;
/*
 *  백준 문제 10988 : 팰린드롬인지 확인하기
 *  Site : https://www.acmicpc.net/problem/10988
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution_10988 {
    static void palindrome(String str) {
        int check = 1;
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                check = 0;
        }
            System.out.println(check);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palind = br.readLine();
        palindrome(palind);
    }
}
