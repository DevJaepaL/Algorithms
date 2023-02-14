
package PythonSeries;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_10833 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void solution() throws IOException {
        int N = Integer.parseInt(br.readLine());
        int remainApples = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int apples = Integer.parseInt(st.nextToken());
            remainApples += apples % students;
        }

        bw.write(String.valueOf(remainApples));
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}
