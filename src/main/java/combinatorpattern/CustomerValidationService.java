package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {

    public boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    public boolean isDobValid(LocalDate dob) {
        return (Period.between(dob, LocalDate.now()).getYears() >= 16);
    }

    public boolean isCustomerValid(Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isDobValid(customer.getDob());
    }
}
