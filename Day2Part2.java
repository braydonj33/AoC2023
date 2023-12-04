import java.util.*;
import java.io.*;

class Day2Part2 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        int lineNum = 1;
        int minRed = 0;
        int minGreen = 0;
        int minBlue = 0;
        int power = 0;
        int powerTotal = 0;
        while(stdin.hasNextLine()) {
            String line = stdin.nextLine();
            int tempBlue = 0;
            int tempGreen = 0;
            int tempRed = 0;
            minBlue = 0;
            minRed = 0;
            minGreen = 0;
            if (lineNum < 10) {
                for (int i = 8; i < line.length(); i++) {
                    if (line.charAt(i+1) != ' ') {
                        if(line.charAt(i+3) == 'b') {
                            tempBlue = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempBlue > minBlue)
                                minBlue = tempBlue;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'g') {
                            tempGreen = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempGreen > minGreen)
                                minGreen = tempGreen;
                            if (i < line.length() - 9) {
                                i += 9;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'r') {
                            tempRed = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempRed > minRed)
                                minRed = tempRed;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        }
                    } else {
                        if (line.charAt(i+2) == 'b') {
                            tempBlue = ((int)line.charAt(i) - '0');
                            if (tempBlue > minBlue)
                                minBlue = tempBlue;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'g') {
                            tempGreen = ((int)line.charAt(i) - '0');
                            if (tempGreen > minGreen)
                                minGreen = tempGreen;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'r') {
                            tempRed = ((int)line.charAt(i) - '0');
                            if (tempRed > minRed)
                                minRed = tempRed;
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
                            if (tempBlue > minBlue)
                                minBlue = tempBlue;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'g') {
                            tempGreen = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempGreen > minGreen)
                                minGreen = tempGreen;
                            if (i < line.length() - 9) {
                                i += 9;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+3) == 'r') {
                            tempRed = ((int)line.charAt(i+1) - '0') + (10 * ((int)line.charAt(i) - '0'));
                            if (tempRed > minRed)
                                minRed = tempRed;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        }
                    } else {
                        if (line.charAt(i+2) == 'b') {
                            tempBlue = ((int)line.charAt(i) - '0');
                            if (tempBlue > minBlue)
                                minBlue = tempBlue;
                            if (i < line.length() - 7) {
                                i += 7;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'g') {
                            tempGreen = ((int)line.charAt(i) - '0');
                            if (tempGreen > minGreen)
                                minGreen = tempGreen;
                            if (i < line.length() - 8) {
                                i += 8;
                            } else {
                                break;
                            }
                        } else if (line.charAt(i+2) == 'r') {
                            tempRed = ((int)line.charAt(i) - '0');
                            if (tempRed > minRed)
                                minRed = tempRed;
                            if (i < line.length() - 6) {
                                i += 6;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            power = minBlue * minRed * minGreen;
            powerTotal += power;
            lineNum ++;
        }
        System.out.println(powerTotal);
    }
}
