package PythonSeries;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_5635 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] name = new String[N];
        int[] totalDay = new int[N];
        int[] tempDay = new int[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            totalDay[i] = (year * 365) + (month * 31) + day;
            tempDay[i] = (year * 365) + (month * 31) + day;
        }
        Arrays.sort(totalDay);

        for(int j = 0; j < N; j++) {
            if(totalDay[N - 1] == tempDay[j]) {
                bw.write(name[j]);
                bw.write("\n");
            }
        }

        for(int k = 0; k < N; k++) {
            if(totalDay[0] == tempDay[k]) {
                bw.write(name[k]);
                bw.write("\n");
            }
        }

        bw.close();
        br.close();
    }
}
