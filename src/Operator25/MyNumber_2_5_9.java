package Operator25;

import java.util.Scanner;

public class MyNumber_2_5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        double y = 4 * Math.pow(x,2) + 2*x + 11;
        System.out.print(y);
//        Метод nextDouble() ограничивается чтением double. Но когда
//        пользователь вводит число, он также нажимает клавишу
//        Enter. Клавиша Enter по сути вводит символ новой стро-
//                ки ( "\n"), который игнорируется методом nextDouble ,
//                так как он не является частью double. Говорят, что метод
//        nextDouble() не поглощает символ новой строки. Для
//        поглощения этого символа необходим вызов метода next­
//        Line()
    }
}