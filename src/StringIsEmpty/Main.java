package StringIsEmpty;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isEmptyString = str -> str.isEmpty();
        String empty = "";
        String notEmpty ="Sulav";
        System.out.println("Is it empty string? :"+isEmptyString.test(empty));
        System.out.println("Is it empty string? :"+isEmptyString.test(notEmpty));

    }

}
