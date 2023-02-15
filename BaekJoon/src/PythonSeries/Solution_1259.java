package PythonSeries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1259 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true)
        {
            String N = br.readLine();
            boolean check = true;

            if(N.equals("0")) {
                break;
            } else {
                for(int i = 0; i < N.length() / 2; i++) {
                    if(N.charAt(i) != N.charAt(N.length() - i - 1)) {
                        check = false;
                    }
                }

                if(check) {
                    bw.write("yes \n");
                    bw.flush();
                } else {
                    bw.write("no \n");
                    bw.flush();
                }
            }
        }
    
        br.close();
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}
