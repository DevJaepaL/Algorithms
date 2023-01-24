package PythonSeries1;

/*
 *  백준 문제 9506 : 약수들의 합
 *  Site : https://www.acmicpc.net/problem/9506
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution_9506 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1)
                break;

            int perfectNum = 0;
            int index = 0;
            int numArr[] = new int[N];
            for(int i = 1; i < N; i++) {
                if(N % i == 0) {
                    numArr[index++] = i;
                    perfectNum += i;
                }
            }

            if(N != perfectNum) {
                System.out.println(N + " is NOT perfect.");
                continue;
            }

            System.out.print(N + " = ");
            for(int j = 0; j < index; j++) {
                if(j == index - 1) // 인덱스 마지막 값에 오면 "숫자" 만 출력
                    System.out.print(numArr[j]);
                else // 인덱스 마지막 값을 제외한 모든 값은 "숫자 + " 출력.
                System.out.print(numArr[j] + " + ");
            }
            System.out.println();
        }

        br.close();
    }
}
