package Operator25;

import java.util.Scanner;

public class myNumber_2_5_16_XX {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int seconds1 = sc.nextInt();
//        int seconds2 = sc.nextInt();
//        sc.close();
        int x = 41000;
        int y = 3600;
//        int day = 24 * 60 * 60;
//        int ostatok = x % day;
        int h1 = x / (60 * 60);
        int m1 = (x % (60 * 60)) / 60;
        int s1 = (x % (60 * 60)) % 60;
        int h2 = y / (60 * 60);
        int m2 = (y % (60 * 60)) / 60;
        int s2 = (y % (60 * 60)) % 60;
//        System.out.println(x % day);
//        System.out.println(day);
//        System.out.println(ostatok);
        System.out.println(h1 + ":" + m1 + ":" + s1);
        System.out.format("%02d"+":"+"%02d"+":"+"%02d", h2, m2, s2);
    }
}