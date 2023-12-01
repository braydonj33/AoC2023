import java.util.*;
import java.io.*;
class 2015AoCDay1Part1 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        int floor = 0;
        while(stdin.hasNext()) {
            String next = stdin.next();
            if (next.equals("("))
                floor += 1;
            else if (next.equals(")"))
                floor -= 1;
        }
        System.out.println(floor);
    }
}