package _3_optional._1_api;

import java.util.Scanner;

public class OptionalExample {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private static String getUserName() {
        System.out.print("Please give me your name: ");
        String name = SCANNER.nextLine();
        if (name.isEmpty()) {
            return null;
        }

        return name;
    }
}