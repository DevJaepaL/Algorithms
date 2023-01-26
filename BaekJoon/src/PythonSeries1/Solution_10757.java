package PythonSeries1;
/*
 *  백준 문제 10757 : 큰 수 A + B
 *  Site : https://www.acmicpc.net/problem/10757
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Solution_10757 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        System.out.println(a.add(b));
    }
    public static void main(String args[]) throws IOException {
        solution();
    }
}
