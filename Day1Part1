import java.util.*;
import java.io.*;
class Day1Part1 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("Input.txt"));
        int num = 0;
        int totalNum = 0;
        while(stdin.hasNextLine()) {
            String next = stdin.nextLine();
            boolean firstDone = false;
            int firstInt = 0;
            int storeInt = 0;
            for(int i = 0; i < next.length(); i++) {
                char nextDigit = next.charAt(i);
                    if (nextDigit == '1') {
                        firstInt = 1;
                        storeInt = 1;
                    } else if (nextDigit == '2') {
                        firstInt = 2;
                        storeInt = 2;
                    } else if (nextDigit == '3') {
                        firstInt = 3;
                        storeInt = 3;
                    } else if (nextDigit == '4') {
                        firstInt = 4;
                        storeInt = 4;
                    } else if (nextDigit == '5') {
                        firstInt = 5;
                        storeInt = 5;
                    } else if (nextDigit == '6') {
                        firstInt = 6;
                        storeInt = 6;
                    } else if (nextDigit == '7') {
                        firstInt = 7;
                        storeInt = 7;
                    } else if (nextDigit == '8') {
                        firstInt = 8;
                        storeInt = 8;
                    } else if (nextDigit == '9') {
                        firstInt = 9;
                        storeInt = 9;
                    }
                    if (firstDone == false) {
                        num = 10 * firstInt;
                        if (num != 0)
                            firstDone = true;
                    }
            }
            num += storeInt;
            firstInt = 0;
            storeInt = 0;
            firstDone = false;
            totalNum = totalNum + num;
            System.out.println(totalNum);
            num = 0;
        }
        System.out.println(totalNum);
        stdin.close();
    }
}

