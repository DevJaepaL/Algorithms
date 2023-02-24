package Programmers_Lv0;

public class Lv0_English {
    public long solution(String numbers) {
        String[] number = {"zero","one","two","three","four",
                           "five","six","seven","eight","nine"};

        for(int i = 0; i < number.length; i++) {
            numbers = numbers.replaceAll(number[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
