package Programmers_Lv0;

class Lv0_SimilarArr {
    public int solution(String[] s1, String[] s2) {
        int cnt = 0;

        for(String findS1 : s1) {
            for(String findS2 : s2) {
                if(findS2.equals(findS1))
                    cnt++;
            }
        }
        return cnt;
    }
}