package PythonSeries1;
/*
 *  백준 문제 2530 : 인공지능 시계
 *  Site : https://www.acmicpc.net/problem/2530
 */
import java.util.*;
public class Solution_2530 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int timer = sc.nextInt();
        sc.close();

        s += timer;
    
        // 초가 60이 되면, 분 +1 , 초를 60과 나눈 나머지 값을 대입
        while(s >= 60) { // 91 / 31 몫 : 1 나머지 : 31
            m += s / 60; // m = +1
            s %= 60;
        }

        // 분이 60초가 되면, 시간 +1 , 분을 60과 나눈 나머지 값을 대입
        while(m >= 60) {
            h += m / 60;
            m %= 60;
        }
        
        // 시간이 24시가 되면, 0시로 초기화.
        while(h >= 24) {
            h -= 24;
        }

        System.out.printf("%d %d %d", h,m,s);
    }    
}
