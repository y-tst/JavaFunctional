package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function takes 1 argument and produces 1 result
        int  increment = incrementByOne(5);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(7);
        System.out.println(increment2);

        int multiple = multipleByTenFunction.apply(increment2);
        System.out.println(multiple);

        int twoOperations = incrementByOneAndMultipleByTenFunction.apply(8);
        System.out.println(twoOperations);

        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultipleByTenBiFunction.apply(2, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer, Integer> multipleByTenFunction = number -> number*10;
    static Function<Integer, Integer> incrementByOneAndMultipleByTenFunction =
            incrementByOneFunction.andThen(multipleByTenFunction);

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultipleByTenBiFunction =
            (numToIncrementByOne, numToMultipleByTen) -> (numToIncrementByOne + 1) * numToMultipleByTen;
    static  int incrementByOne(int number){
        return number + 1;
    }
    static  int incrementByOneAndMultipleByTen(int numToAdd, int numbToMultiple){
        return (numToAdd + 1) * 10;
    }
}
