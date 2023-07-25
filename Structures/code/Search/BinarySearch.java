package code.Search;
/* 종류 : 검색(Search)
 * 구현 방식 : 이진 탐색
 * 방식 : 배열의 중간 값을 구해서 찾고자 하는 값이 중간 값보다 크면
 *       배열의 첫번 째 값을 중간 값의 +1 한 값을 설정 반대의 경우
 *       배열의 마지막 값을 중간 값의 -1 한 값을 설정 
 * 유의 사항 : 배열 내의 원소가 전부 정렬 돼있야한다. */

public class BinarySearch {
    // 버블 정렬(Bubble Sort) 메소드
    private static final int[] bubbleSort(int[] arrElement) {
        for (int i = 0; i < arrElement.length; i++) {
            for (int j = i + 1; j < arrElement.length; j++) {
                if (arrElement[i] > arrElement[j]) {
                    int temp = arrElement[i];
                    arrElement[i] = arrElement[j];
                    arrElement[j] = temp;
                }
            }
        }
        return arrElement;
    }

    // 이진 탐색(Binary Search) 메소드
    private static final boolean binarySearch(int[] findArray, int findKey) {
        int startIndex = 0; // 배열의 첫번 째 원소
        int endIndex = findArray.length - 1; // 배열의 마지막 원소
        // 첫번 째 원소 값과 마지막 원소 값의 크기가 같을 때 까지 반복한다.
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2; // 배열의 중간 원소
            if (findKey < findArray[midIndex]) {
                endIndex = midIndex - 1;
            } else if (findKey > findArray[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return true;
            }
        }
        // 배열 내에 Key 값이 없으면 -1 반환.
        return false;
    }

    // 메인 메소드
    public static void main(String[] args) {
        int[] arr = { 3, 43, 328, 44, 1 };
        bubbleSort(arr);
        if (binarySearch(arr, 0)) {
            System.out.println("열쇠 발견 - !");
        } else {
            System.out.println("열쇠 발견 실패 . .");
        }
    }
}
