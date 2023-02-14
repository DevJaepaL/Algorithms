package PythonSeries1;
/*
 *  백준 문제 7567 : 그릇
 *  Site : https://www.acmicpc.net/problem/7567
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Solution_7567 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int height = 10;
        
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i-1))
                height += 5;
            else
                height += 10;
        }
        System.out.println(height);
    }
}
