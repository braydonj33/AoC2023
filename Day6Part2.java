import java.util.*;
import java.io.*;

public class Day6Part2 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        stdin.next();
        String tempTime = "";
        for(int i = 0; i < 4; i++) {
            tempTime = tempTime + stdin.next();
        }
        int time = Integer.valueOf(tempTime);
        stdin.next();
        String tempDist = "";
        for(int i = 0; i < 4; i++) {
            tempDist = tempDist + stdin.next();
        }
        long dist = Long.valueOf(tempDist);
        int cnt = 0;
        for (long i = 0; i < time; i++) {
            long distTraveled = (time-i) * i;
            if (distTraveled > dist) {
                cnt++;
            }
        }
        System.out.println(cnt);
        stdin.close();
    }
}
