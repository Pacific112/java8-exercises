package _3_optional._1_api;

import java.util.Optional;
import java.util.Scanner;

public class OptionalExample {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // tworzenie
//        Optional<String> optionalName = Optional.of("Maciek");
//        Optional<String> optionalName = Optional.empty();
        String userName = getUserName();
//        Optional<String> optionalName;
//        if (userName == null) {
//            optionalName = Optional.empty();
//        } else {
//            optionalName = Optional.of(userName);
//        }
        Optional<String> optionalName = Optional.ofNullable(getUserName());

//        if (optionalName.isPresent()) {
//            System.out.println("The name is " + optionalName.get());
//        } else {
//            System.out.println("There is no name! ");
//        }
        String name = optionalName.orElse("Marek");
        System.out.println("The name is " + name);
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