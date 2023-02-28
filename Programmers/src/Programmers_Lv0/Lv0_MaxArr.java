package Programmers_Lv0;

class Lv0_MaxArr {
    public int solution(int[] numbers) {
        int maxValue = 0;
        int maxValueIndex = 0;
        int secondValue = 0;
            /*
             *  변수 'maxValue' = 해당 배열의 최댓 값
             *  변수 'maxValueIndex' = 최댓 값의 인덱스.
             */
        for(int i = 0; i < numbers.length; i++) {
            if(maxValue <= numbers[i]) {
                maxValue = numbers[i];
                maxValueIndex = i;
            }
        }
            /*
             * 첫 번째 루프에서 지정한 index 값을 제외한 최대값을 선정  * 
             */
        for(int i = 0; i < numbers.length; i++) {
            if(secondValue <= numbers[i] && i != maxValueIndex) {
                secondValue = numbers[i];
            }
        }

        return maxValue * secondValue;
    }
}
