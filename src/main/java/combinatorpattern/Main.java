package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Allice",
                "alice@gmail.com",
                "+044984984964",
                LocalDate.of(2000, 12, 31));

//        CustomerValidationService customerValidationService = new CustomerValidationService();
//        System.out.println(customerValidationService.isCustomerValid(customer));

        // the same, but shorter:
        System.out.println(new CustomerValidationService().isCustomerValid(customer));

    }


}
