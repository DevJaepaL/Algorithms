package Programmers_Lv0;

class Lv0_FindMaxNum {
    public int[] solution(int[] array) {
        int maxIndex = 0;
        int maxNum = 0;
        
        for(int i = 1; i < array.length; i++) {
            if(maxNum < array[i]) {
                maxIndex = i;
                maxNum = array[i];
            }
        }

        int[] answer = {maxNum, maxIndex};
        return answer;
    }
}