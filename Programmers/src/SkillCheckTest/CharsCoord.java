package SkillCheckTest;

public class CharsCoord {

    public int[] solution(String[] keyinput, int[] board) {
        int xCnt = 0;
        int yCnt = 0;
        final int leftCoord = -board[0] / 2;
        final int rightCoord = board[0] / 2;
        final int downCoord = -board[1] / 2;
        final int upCoord = board[1] / 2;

        for(int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i])
            {
              case "down":
                yCnt -= 1;
                break;
              case "up":
                yCnt += 1;
                break;
              case "left":
                xCnt -= 1;
                break;
              case "right":
                xCnt += 1;
                break;
            }    
        }
        
        if(xCnt >= leftCoord) {
            xCnt = leftCoord;
        } else if(xCnt >= rightCoord) {
            yCnt = rightCoord;
        }

        if(yCnt >= downCoord) {
            yCnt = downCoord;
        } else if(yCnt >= upCoord) {
            yCnt = upCoord;
        }

        int[] answer = {xCnt, yCnt};
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {7,9};
        System.out.println(-arr[0] / 2);
    }
}