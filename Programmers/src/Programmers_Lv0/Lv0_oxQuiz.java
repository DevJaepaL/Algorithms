package Programmers_Lv0;

import java.util.ArrayList;

public class Lv0_oxQuiz {
    public String[] solution(String[] quiz) {
        ArrayList<String> AnswersList = new ArrayList<>();
        for(String str : quiz) {
            String[] splitStr = str.replaceAll("- -", "").
                                    replaceAll("- ", "-").
                                    replaceAll("[+] ", "").
                                    split(" ");
            
            if(Integer.parseInt(splitStr[0]) + Integer.parseInt(splitStr[1]) 
                                            == Integer.parseInt(splitStr[3])) {
                AnswersList.add("O");
            } else { 
                AnswersList.add("X");
            }
        }

        String[] answer = AnswersList.toArray(new String[0]);
        return answer;
    }
}
