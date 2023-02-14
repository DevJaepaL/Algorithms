package PythonSeries;
/*
 *  백준 문제 5086 : 배수와 약수
 *  Site : https://www.acmicpc.net/problem/5086
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Solution_5086 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0 && m == 0) 
                break;
            else if(n < m && m % n == 0) {
                System.out.println("factor");
            }
            else if(n > m && n % m == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
        }
        
        br.close();
    }
    public static void main(String args[]) throws Exception {
        solution();
    }
}
