import java.util.*;
import java.io.*;
class AoC2015Day1Part1 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        int floor = 0;
        String tot = stdin.nextLine();
        for (int i = 0; i < tot.length(); i++) {
            if (tot.charAt(i) == '(')
                floor += 1;
            else if (tot.charAt(i) == ')')
                floor -= 1;
            if (floor < 0) {
                System.out.println(i + 1);
                break;
            }
        }
        System.out.println(floor);
    }
}