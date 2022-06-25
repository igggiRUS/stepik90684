package logic32;


import java.util.Scanner;

public class MyProgram3213 {
    public static void main(String[] args) {
        String str = "asdf lkj wer";
        Scanner scanner = new Scanner(str);
//        Scanner scanner = new Scanner(System.in);
        char one = scanner.next().charAt(0);
        char two = scanner.next().charAt(0);
        char three = scanner.next().charAt(0);
        scanner.close();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        


    }
}
