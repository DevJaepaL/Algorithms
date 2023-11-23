package Programmers_Lv1;

import java.util.HashMap;

class Lv1_Photo {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        final int SIZE = photo.length;
        int[] answer = new int[SIZE]; // 추억 점수를 담을 배열 의 값.

        // 두 개의 배열을 HashMap으로 변환
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < SIZE; i++) {
            int score = 0; // 각 배열의 추억 점수를 쌓을 값
            
            for(int j = 0; j < photo[i].length; j++) {
                String currentPhotoName = photo[i][j];
                System.out.println("현재 값 : " + currentPhotoName);
                if(hashMap.containsKey(currentPhotoName)) {
                    score += hashMap.get(currentPhotoName);
                }
            }

            answer[i] = score;
        }

        return answer;
    }
    
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};

        String[][] photo = {
            {"may", "kein", "kain", "radi"},
            {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}
        };

        Lv1_Photo test = new Lv1_Photo();

        System.out.println(test.solution(name, yearning, photo)[1]);
        
    }
}