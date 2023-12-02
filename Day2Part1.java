import java.util.*;
import java.io.*;

class Day2Part1 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        int redTotal = 12;
        int greenTotal = 13;
        int blueTotal = 14;
        int lineNum = 1;
        int lineTotal = 0;
        boolean valid = true;
        while(stdin.hasNextLine()) {
            String line = stdin.nextLine();
            int tempBlue = 0;
            int tempGreen = 0;
            int tempRed = 0;
            valid = true;
            if (lineNum < 10) {
                for (int i = 8; i < line.length(); i++) {
                    if (line.charAt(i+1) != ' ') {
                        if(line.charAt(i+3) == 'b') {
                            tempBlue = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempBlue > blueTotal)
                                valid = false;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'g') {
                            tempGreen = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempGreen > greenTotal)
                                valid = false;
                            if (i < line.length() - 9) {
                                i += 9;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'r') {
                            tempRed = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempRed > redTotal)
                                valid = false;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        }
                    } else {
                        if (line.charAt(i+2) == 'b') {
                            tempBlue = ((int)line.charAt(i) - '0');
                            if (tempBlue > blueTotal)
                                valid = false;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'g') {
                            tempGreen = ((int)line.charAt(i) - '0');
                            if (tempGreen > greenTotal)
                                valid = false;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'r') {
                            tempRed = ((int)line.charAt(i) - '0');
                            if (tempRed > redTotal)
                                valid = false;
                            if (i < line.length() - 6) {
                                i += 6;
                            } else {
                                break;
                            }
                        }
                    }
                }
            } else {
                for (int i = 9; i < line.length(); i++) {
                    if (line.charAt(i+1) != ' ') {
                        if(line.charAt(i+3) == 'b') {
                            tempBlue = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempBlue > blueTotal)
                                valid = false;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'g') {
                            tempGreen = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempGreen > greenTotal)
                                valid = false;
                            if (i < line.length() - 9) {
                                i += 9;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'r') {
                            tempRed = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempRed > redTotal)
                                valid = false;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        }
                    } else {
                        if (line.charAt(i+2) == 'b') {
                            tempBlue = ((int)line.charAt(i) - '0');
                            if (tempBlue > blueTotal)
                                valid = false;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'g') {
                            tempGreen = ((int)line.charAt(i) - '0');
                            if (tempGreen > greenTotal)
                                valid = false;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'r') {
                            tempRed = ((int)line.charAt(i) - '0');
                            if (tempRed > redTotal)
                                valid = false;
                            if (i < line.length() - 6) {
                                i += 6;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            if (valid) {
                    lineTotal += lineNum;
            }
            lineNum ++;
        }
        System.out.println(lineTotal);
    }
}
