package PythonSeries;

import java.io.*;

public class Solution_5565 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void solution(int B) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int booksPrice = 0;
        for(int i = 1; i < 10; i++) {
            int readingBooks = Integer.parseInt(br.readLine());
            booksPrice += readingBooks;
        }
        B -= booksPrice;
        bw.write(String.valueOf(B));
        bw.close();
        br.close();
    }
    public static void main(String[] args) throws IOException {
        int b = Integer.parseInt(br.readLine());
        solution(b);
    }
}
