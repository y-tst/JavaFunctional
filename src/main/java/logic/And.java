package logic;

import java.util.Scanner;

public class And {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number: ");

        int num = Integer.parseInt(scanner.next());

        if (num >=0 && num < 100)
            System.out.println("Your number is 10..., jocking), it is: " + num);
        else
            System.out.println("out of bounds..., it should be less than 100!");

    }
}
