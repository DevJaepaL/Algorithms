package Programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_K {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> ansArrList = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int arrStartNum = commands[i][0];
            int arrEndNum = commands[i][1];
            int arrElement = commands[i][2];

            int copyArr[] = Arrays.copyOfRange(array, arrStartNum, arrEndNum);
            copyArr = Lv1_K.sort(copyArr);
            ansArrList.add(copyArr[arrElement]);
        }

        int[] answer = new int[ansArrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ansArrList.get(i);
        }
        return answer;
    }

    public static void main(String args[]) {
        ArrayList<Integer> ansArrList = new ArrayList<>();
        int[] array = { 1, 2, 5, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

        int arrStartNum = commands[0][0];
        int arrEndNum = commands[0][1];
        int arrElement = commands[0][2];

        int copyArr[] = Arrays.copyOfRange(array, arrStartNum - 1, arrEndNum);
        copyArr = Lv1_K.sort(copyArr);
        ansArrList.add(copyArr[arrElement - 1]);

        int[] answer = new int[ansArrList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = ansArrList.get(i);
            System.out.println(answer[i]);
        }

    }
}
