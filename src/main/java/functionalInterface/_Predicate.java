package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneValid("07345678"));
        System.out.println(isPhoneValid("09345678"));
        System.out.println(isPhoneValid("0734500678"));


        System.out.println(isPhoneValidPredicate.test("07345678"));
        System.out.println(isPhoneValidPredicate.test("09345678"));
        System.out.println(isPhoneValidPredicate.test("07345646678"));

        System.out.println("Predicate chain: " + isPhoneValidPredicate.and(containsThree).test("07345678"));
        System.out.println("Predicate chain: " + isPhoneValidPredicate.or(containsThree).test("09000003"));

    }

    static boolean isPhoneValid(String phoneNumber) {
        return (phoneNumber.startsWith("07") && phoneNumber.length() == 8);
    }

    static Predicate<String> isPhoneValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 8;

    static Predicate<String> containsThree = phoneNumber ->
            phoneNumber.contains("3");

}