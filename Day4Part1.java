import java.util.*;
import java.io.*;

class Day4Part1 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        int startNum = 10;
        int startNum2 = 42;
        int endNum = 37;
        int endNum2 = 114;
        int goodNum = 10;
        int haveNum = 25;
        int pointTotal = 0;
        while(stdin.hasNextLine()) {
            int[] goodNums = new int[goodNum];
            int[] haveNums = new int[haveNum];
            int numCounter = 0;
            int pointTemp = 0;
            String line = stdin.nextLine();
            for (int i = startNum; i <= endNum; i += 3) {
                if(line.charAt(i) == ' ') {
                    goodNums[numCounter] = (line.charAt(i+1)-'0');
                } else {
                    goodNums[numCounter] = 10*(line.charAt(i)-'0') + (line.charAt(i+1)-'0');
                }
                numCounter++;
            }
            numCounter = 0;
            for (int i = startNum2; i <= endNum2; i += 3) {
                if(line.charAt(i) == ' ') {
                    haveNums[numCounter] = (line.charAt(i+1)-'0');
                } else {
                    haveNums[numCounter] = 10*(line.charAt(i)-'0') + (line.charAt(i+1)-'0');
                }
                numCounter++;
            }
            for (int i = 0; i < haveNums.length; i++) {
                for (int j = 0; j < goodNums.length; j++) {
                    if(goodNums[j] == haveNums[i] && pointTemp == 0) {
                        pointTemp = 1;
                    } else if (goodNums[j] == haveNums[i]) {
                        pointTemp *= 2;
                    }
                }
            }
            pointTotal += pointTemp;
        }
        System.out.println(pointTotal);
        stdin.close();
    }
}