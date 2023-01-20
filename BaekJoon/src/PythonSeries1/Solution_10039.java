package PythonSeries1;
/*
 *  백준 문제 10039 : 평균 점수
 *  Site : https://www.acmicpc.net/problem/10039
 */
import java.util.*;
public class Solution_10039 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int sum = 0;
        
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if(num[i] <= 40) num[i] = 40;
            sum += num[i];
        }
    
        System.out.print(sum / num.length);
        sc.close();
    }
}
