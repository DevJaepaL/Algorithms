/* 실버 문제 : 수 찾기
 * Link : https://www.acmicpc.net/problem/1920
 * 구현 알고리즘 : 이진 탐색 (Binary Search)
 */
package Silver;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_1920 {
    // 이분 탐색 구현 메소드
    public static int binarySearch(int[] searchArr, int key) {
        int lowIndex  = 0; // 배열 탐색 범위의 왼쪽 끝 인덱스 값
        int highIndex = searchArr.length - 1; // 배열 탐색 범위의 오른쪽 끝 인덱스 값

        // low 값이 high 값보다 커지기 전까지 Loop
        while(lowIndex <= highIndex)
        {
            // 찾고자 하는 배열의 중간 값
            int midIndex = (lowIndex + highIndex) / 2;

            /* key 값이 중간값 보다 작을 경우 high 값 재조정 */
            if(key < searchArr[midIndex]) {
                highIndex = midIndex - 1;
            } 
            
            /* key 값이 중간값 보다 클 경우 low 값 재조정 */
            else if(key > searchArr[midIndex]) {
                lowIndex = midIndex + 1;
            } 
            
            // key 값이 중간값과 같을 경우 값 그대로 반환
            else {
                return midIndex;
            }
        }

        // 찾는 값이 존재하지 않을 경우 부정(-1)
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int[] arr = new int[index];

        for(int i = 0; i < index; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 배열 정렬

        StringBuilder sb = new StringBuilder();
        int findIndexValue = sc.nextInt();

        for(int i = 0; i < findIndexValue; i++) {
            if(binarySearch(arr, sc.nextInt()) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}

