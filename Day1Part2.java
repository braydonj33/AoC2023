import java.util.*;
import java.io.*;
class Day1Part2 {
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
                    if (nextDigit == 'o' && i < next.length() - 2) {
                        if (next.charAt(i+1) == 'n' && next.charAt(i+2) == 'e') {
                            firstInt = 1;
                            storeInt = 1;
                        }
                    } else if (nextDigit == 't') {
                        if (i < next.length() - 2 && next.charAt(i+1) == 'w' && next.charAt(i+2) == 'o') {
                            firstInt = 2;
                            storeInt = 2;
                        } else if (i < next.length() - 4 && next.charAt(i+1) == 'h' && next.charAt(i+2) == 'r' && next.charAt(i+3) == 'e' && next.charAt(i+4) == 'e') {
                            firstInt = 3;
                            storeInt = 3;
                        }
                    } else if (nextDigit == 'f' && i < next.length() - 3) {
                        if (next.charAt(i+1) == 'o' && next.charAt(i+2) == 'u' && next.charAt(i+3) == 'r') {
                            firstInt = 4;
                            storeInt = 4;
                        } else if (next.charAt(i+1) == 'i' && next.charAt(i+2) == 'v' && next.charAt(i+3) == 'e') {
                            firstInt = 5;
                            storeInt = 5;
                        }
                    } else if (nextDigit == 's') {
                        if (i < next.length() - 2 && next.charAt(i+1) == 'i' && next.charAt(i+2) == 'x') {
                            firstInt = 6;
                            storeInt = 6;
                        } else if (i < next.length() - 4 && next.charAt(i+1) == 'e' && next.charAt(i+2) == 'v' && next.charAt(i+3) == 'e' && next.charAt(i+4) == 'n') {
                            firstInt = 7;
                            storeInt = 7;
                        }
                    } else if (nextDigit == 'e' && i < next.length() - 4) {
                        if (next.charAt(i+1) == 'i' && next.charAt(i+2) == 'g' && next.charAt(i+3) == 'h' && next.charAt(i+4) == 't') {
                            firstInt = 8;
                            storeInt = 8;
                        }
                    } else if (nextDigit == 'n' && i < next.length() - 3) {
                        if (next.charAt(i+1) == 'i' && next.charAt(i+2) == 'n' && next.charAt(i+3) == 'e') {
                            firstInt = 9;
                            storeInt = 9;
                        }
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
            num = 0;
        }
        System.out.println(totalNum);
        stdin.close();
    }
}

