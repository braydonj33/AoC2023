import java.util.*;
import java.io.*;

public class Day5Part1 {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(new File("input.txt"));
        stdin.next();
        long[] seeds = new long[20];
        long[] locs = new long[20];
        int cnt = 0;
        for(int i = 0; i < seeds.length; i++) {
            seeds[i] = Long.valueOf(stdin.next());
        }
        String[] seed2soilStrs = new String[32];
        String[] soil2fertStrs = new String[18];
        String[] fert2waterStrs = new String[48];
        String[] water2lightStrs = new String[33];
        String[] light2tempStrs = new String[36];
        String[] temp2humStrs = new String[29];
        String[] hum2locStrs = new String[28];
        int strsNum = 0;
        int set = 0;
        while(stdin.hasNextLine()) {
            String next = stdin.nextLine();
            if(next.contains("seed-to-soil")) {
                strsNum = 0;
                continue;
            } else if (next.contains("soil-to-fertilizer")) {
                strsNum = 0;
                set = 1;
                continue;
            } else if (next.contains("fertilizer-to-water")) {
                strsNum = 0;
                set = 2;
                continue;
            } else if (next.contains("water-to-light")) {
                strsNum = 0;
                set = 3;
                continue;
            } else if (next.contains("light-to-temperature")) {
                strsNum = 0;
                set = 4;
                continue;
            } else if (next.contains("temperature-to-humidity")) {
                strsNum = 0;
                set = 5;
                continue;
            } else if (next.contains("humidity-to-location")) {
                strsNum = 0;
                set = 6;
                continue;
            } else if (next.equals("")) {
                strsNum = 0;
                continue;
            }
            if (set == 0) {
                seed2soilStrs[strsNum] = next;
            } else if (set == 1) {
                soil2fertStrs[strsNum] = next;
            } else if (set == 2) {
                fert2waterStrs[strsNum] = next;
            } else if (set == 3) {
                water2lightStrs[strsNum] = next;
            } else if (set == 4) {
                light2tempStrs[strsNum] = next;
            } else if (set == 5) {
                temp2humStrs[strsNum] = next;
            } else if (set == 6) {
                hum2locStrs[strsNum] = next;
            }
            strsNum++;
        }
        long[][] seedRanges = new long[seed2soilStrs.length][4];
        for (int i = 0; i < seed2soilStrs.length; i++) {
            String[] next = seed2soilStrs[i].split(" ");
            seedRanges[i][0] = Long.valueOf(next[0]);
            seedRanges[i][1] = Long.valueOf(next[1]);
            seedRanges[i][2] = Long.valueOf(next[2]);
            seedRanges[i][3] = Long.valueOf(next[0])-Long.valueOf(next[1]);
            for(int j = 0; j < seedRanges.length; j++) {
                if (j < seedRanges.length - 1 && seedRanges[j][1] < seedRanges[j+1][1]) {
                    long temp = seedRanges[j][1];
                    long temp2 = seedRanges[j][0];
                    long temp3 = seedRanges[j][2];
                    long temp4 = seedRanges[j][3];
                    seedRanges[j][1] = seedRanges[j+1][1];
                    seedRanges[j+1][1] = temp;
                    seedRanges[j][0] = seedRanges[j+1][0];
                    seedRanges[j+1][0] = temp2;
                    seedRanges[j][2] = seedRanges[j+1][2];
                    seedRanges[j+1][2] = temp3;
                    seedRanges[j][3] = seedRanges[j+1][3];
                    seedRanges[j+1][3] = temp4;
                }
            }
        }
        long[][] soilRanges = new long[soil2fertStrs.length][4];
        for (int i = 0; i < soil2fertStrs.length; i++) {
            String[] next = soil2fertStrs[i].split(" ");
            soilRanges[i][0] = Long.valueOf(next[0]);
            soilRanges[i][1] = Long.valueOf(next[1]);
            soilRanges[i][2] = Long.valueOf(next[2]);
            soilRanges[i][3] = Long.valueOf(next[0])-Long.valueOf(next[1]);
            for(int j = 0; j < soilRanges.length; j++) {
                if (j < soilRanges.length - 1 && soilRanges[j][1] < soilRanges[j+1][1]) {
                    long temp = soilRanges[j][1];
                    long temp2 = soilRanges[j][0];
                    long temp3 = soilRanges[j][2];
                    long temp4 = soilRanges[j][3];
                    soilRanges[j][1] = soilRanges[j+1][1];
                    soilRanges[j+1][1] = temp;
                    soilRanges[j][0] = soilRanges[j+1][0];
                    soilRanges[j+1][0] = temp2;
                    soilRanges[j][2] = soilRanges[j+1][2];
                    soilRanges[j+1][2] = temp3;
                    soilRanges[j][3] = soilRanges[j+1][3];
                    soilRanges[j+1][3] = temp4;
                }
            }
        }
        long[][] fertRanges = new long[fert2waterStrs.length][4];
        for (int i = 0; i < fert2waterStrs.length; i++) {
            String[] next = fert2waterStrs[i].split(" ");
            fertRanges[i][0] = Long.valueOf(next[0]);
            fertRanges[i][1] = Long.valueOf(next[1]);
            fertRanges[i][2] = Long.valueOf(next[2]);
            fertRanges[i][3] = Long.valueOf(next[0])-Long.valueOf(next[1]);
            for(int j = 0; j < fertRanges.length; j++) {
                if (j < fertRanges.length - 1 && fertRanges[j][1] < fertRanges[j+1][1]) {
                    long temp = fertRanges[j][1];
                    long temp2 = fertRanges[j][0];
                    long temp3 = fertRanges[j][2];
                    long temp4 = fertRanges[j][3];
                    fertRanges[j][1] = fertRanges[j+1][1];
                    fertRanges[j+1][1] = temp;
                    fertRanges[j][0] = fertRanges[j+1][0];
                    fertRanges[j+1][0] = temp2;
                    fertRanges[j][2] = fertRanges[j+1][2];
                    fertRanges[j+1][2] = temp3;
                    fertRanges[j][3] = fertRanges[j+1][3];
                    fertRanges[j+1][3] = temp4;
                }
            }
        }
        long[][] waterRanges = new long[water2lightStrs.length][4];
        for (int i = 0; i < water2lightStrs.length; i++) {
            String[] next = water2lightStrs[i].split(" ");
            waterRanges[i][0] = Long.valueOf(next[0]);
            waterRanges[i][1] = Long.valueOf(next[1]);
            waterRanges[i][2] = Long.valueOf(next[2]);
            waterRanges[i][3] = Long.valueOf(next[0])-Long.valueOf(next[1]);
            for(int j = 0; j < waterRanges.length; j++) {
                if (j < waterRanges.length - 1 && waterRanges[j][1] < waterRanges[j+1][1]) {
                    long temp = waterRanges[j][1];
                    long temp2 = waterRanges[j][0];
                    long temp3 = waterRanges[j][2];
                    long temp4 = waterRanges[j][3];
                    waterRanges[j][1] = waterRanges[j+1][1];
                    waterRanges[j+1][1] = temp;
                    waterRanges[j][0] = waterRanges[j+1][0];
                    waterRanges[j+1][0] = temp2;
                    waterRanges[j][2] = waterRanges[j+1][2];
                    waterRanges[j+1][2] = temp3;
                    waterRanges[j][3] = waterRanges[j+1][3];
                    waterRanges[j+1][3] = temp4;
                }
            }
        }
        long[][] lightRanges = new long[light2tempStrs.length][4];
        for (int i = 0; i < light2tempStrs.length; i++) {
            String[] next = light2tempStrs[i].split(" ");
            lightRanges[i][0] = Long.valueOf(next[0]);
            lightRanges[i][1] = Long.valueOf(next[1]);
            lightRanges[i][2] = Long.valueOf(next[2]);
            lightRanges[i][3] = Long.valueOf(next[0])-Long.valueOf(next[1]);
            for(int j = 0; j < lightRanges.length; j++) {
                if (j < lightRanges.length - 1 && lightRanges[j][1] < lightRanges[j+1][1]) {
                    long temp = lightRanges[j][1];
                    long temp2 = lightRanges[j][0];
                    long temp3 = lightRanges[j][2];
                    long temp4 = lightRanges[j][3];
                    lightRanges[j][1] = lightRanges[j+1][1];
                    lightRanges[j+1][1] = temp;
                    lightRanges[j][0] = lightRanges[j+1][0];
                    lightRanges[j+1][0] = temp2;
                    lightRanges[j][2] = lightRanges[j+1][2];
                    lightRanges[j+1][2] = temp3;
                    lightRanges[j][3] = lightRanges[j+1][3];
                    lightRanges[j+1][3] = temp4;
                }
            }
        }
        long[][] tempRanges = new long[temp2humStrs.length][4];
        for (int i = 0; i < temp2humStrs.length; i++) {
            String[] next = temp2humStrs[i].split(" ");
            tempRanges[i][0] = Long.valueOf(next[0]);
            tempRanges[i][1] = Long.valueOf(next[1]);
            tempRanges[i][2] = Long.valueOf(next[2]);
            tempRanges[i][3] = Long.valueOf(next[0])-Long.valueOf(next[1]);
            for(int j = 0; j < tempRanges.length; j++) {
                if (j < tempRanges.length - 1 && tempRanges[j][1] < tempRanges[j+1][1]) {
                    long temp = tempRanges[j][1];
                    long temp2 = tempRanges[j][0];
                    long temp3 = tempRanges[j][2];
                    long temp4 = tempRanges[j][3];
                    tempRanges[j][1] = tempRanges[j+1][1];
                    tempRanges[j+1][1] = temp;
                    tempRanges[j][0] = tempRanges[j+1][0];
                    tempRanges[j+1][0] = temp2;
                    tempRanges[j][2] = tempRanges[j+1][2];
                    tempRanges[j+1][2] = temp3;
                    tempRanges[j][3] = tempRanges[j+1][3];
                    tempRanges[j+1][3] = temp4;
                }
            }
        }
        long[][] humRanges = new long[hum2locStrs.length][4];
        for (int i = 0; i < hum2locStrs.length; i++) {
            String[] next = hum2locStrs[i].split(" ");
            humRanges[i][0] = Long.valueOf(next[0]);
            humRanges[i][1] = Long.valueOf(next[1]);
            humRanges[i][2] = Long.valueOf(next[2]);
            humRanges[i][3] = Long.valueOf(next[0])-Long.valueOf(next[1]);
            for(int j = 0; j < humRanges.length; j++) {
                if (j < humRanges.length - 1 && humRanges[j][1] < humRanges[j+1][1]) {
                    long temp = humRanges[j][1];
                    long temp2 = humRanges[j][0];
                    long temp3 = humRanges[j][2];
                    long temp4 = humRanges[j][3];
                    humRanges[j][1] = humRanges[j+1][1];
                    humRanges[j+1][1] = temp;
                    humRanges[j][0] = humRanges[j+1][0];
                    humRanges[j+1][0] = temp2;
                    humRanges[j][2] = humRanges[j+1][2];
                    humRanges[j+1][2] = temp3;
                    humRanges[j][3] = humRanges[j+1][3];
                    humRanges[j+1][3] = temp4;
                }
            }
        }
        for (int i = 0; i < seeds.length; i++) {
            long num = seeds[i];
            for (int j = seedRanges.length - 1; j >= 0; j--) {
                if (num < seedRanges[j][1] + seedRanges[j][2] && num >= seedRanges[j][1]) {
                    num = num + seedRanges[j][3];
                    break;
                }
            }
            for (int j = soilRanges.length - 1; j >= 0; j--) {
                if (num < soilRanges[j][1] + soilRanges[j][2] && num >= soilRanges[j][1]) {
                    num = num + soilRanges[j][3];
                    break;
                }
            }
            for (int j = fertRanges.length - 1; j >= 0; j--) {
                if (num < fertRanges[j][1] + fertRanges[j][2] && num >= fertRanges[j][1]) {
                    num = num + fertRanges[j][3];
                    break;
                }
            }
            for (int j = waterRanges.length - 1; j >= 0; j--) {
                if (num < waterRanges[j][1] + waterRanges[j][2] && num >= waterRanges[j][1]) {
                    num = num + waterRanges[j][3];
                    break;
                }
            }
            for (int j = lightRanges.length - 1; j >= 0; j--) {
                if (num < lightRanges[j][1] + lightRanges[j][2] && num >= lightRanges[j][1]) {
                    num = num + lightRanges[j][3];
                    break;
                }
            }
            for (int j = tempRanges.length - 1; j >= 0; j--) {
                if (num < tempRanges[j][1] + tempRanges[j][2] && num >= tempRanges[j][1]) {
                    num = num + tempRanges[j][3];
                    break;
                }
            }
            for (int j = humRanges.length - 1; j >= 0; j--) {
                if (num < humRanges[j][1] + humRanges[j][2] && num >= humRanges[j][1]) {
                    num = num + humRanges[j][3];
                }
            }
            locs[cnt] = num;
            cnt++;
        }
        long lowLoc = Long.MAX_VALUE;
        for (int i = 0; i < locs.length; i++) {
            if (locs[i] < lowLoc) {
                lowLoc = locs[i];
            }
        }
        System.out.println(lowLoc);
        stdin.close();
    }
}
