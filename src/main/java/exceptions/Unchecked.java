package exceptions;

public class Unchecked {

    public static void main(String[] args) {
//        String name = "John";
        String name = null;
        printTheNameLength(name);

    }

    public  static  void printTheNameLength(String myString){
        System.out.println(myString.length());
    }
}
