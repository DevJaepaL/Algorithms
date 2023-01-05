package Programmers_Lv0;
/*
 *  Programmers Lv.0 : 안전 지대
 *  Site : https://school.programmers.co.kr/learn/courses/30/lessons/120866
 */
public class Lv0_SafeArea {
    public int solution(int[][] board) {
        final int MINE = 1;
        int safetyArea = 0;
        int mineArea = 1;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == MINE) {   
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == safetyArea)
                    safetyArea++;
            }
        }

        return safetyArea;
    }
}
