package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier);
        System.out.println(getDBConnectionUrlSupplierV2);
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5602/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5602/users";
    static Supplier<List<String>> getDBConnectionUrlSupplierV2 = () -> List.of("jdbc://localhost:5602/users", "jdbc://localhost:5602/contacts");
}
