package Programmers_Lv0;
/*
 *  Programmers Lv.0 : 로그인 성공?
 *  Site : https://school.programmers.co.kr/learn/courses/30/lessons/120883
 */
public class Lv0_Programmers14 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        final int MAXARR = 2;

        if(id_pw.length == MAXARR)
        {
            for(int i = 0; i < db.length; i++) {
                    if(db[i][0].equals(id_pw[0])) {
                        if(db[i][1].equals(id_pw[1]))
                            return "login";
                        else
                            return "wrong pw";
                    } 
            }
        }
        return "fail";
    }
}
