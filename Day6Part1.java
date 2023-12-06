import java.util.*;
import java.io.*;

public class Day6Part1 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        stdin.next();
        int[] times = new int[4];
        int[] dists = new int[4];
        for(int i = 0; i < times.length; i++) {
            times[i] = Integer.valueOf(stdin.next());
        }
        stdin.next();
        for (int i = 0; i < dists.length; i++) {
            dists[i] = Integer.valueOf(stdin.next());
        }
        int cnt = 0;
        int[] records = new int[4];
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times[i]; j++) {
                int distTraveled = (times[i]-j) * j;
                if (distTraveled > dists[i]) {
                    cnt++;
                }
            }
            records[i] = cnt;
            cnt = 0;
        }
        System.out.println(records[0]*records[1]*records[2]*records[3]);
        stdin.close();
    }
}
