package PythonSeries1;
/*
 *  백준 문제 10699 : 오늘 날짜
 *  Site : https://www.acmicpc.net/problem/10699
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Solution_10699 {
    static void writeTime() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = new Date();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sdf.format(dt));
        bw.flush();
        bw.close();
    }
    public static void main(String args[]) throws IOException {
        writeTime();
    }
}