package Programmers_Lv0;

class Lv0_BinarySum {
    public String solution(String bin1, String bin2) {
        int binary = Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2);
        String answer = Integer.toBinaryString(binary);
        return answer;
    }
}