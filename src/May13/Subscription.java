package May13;

import java.time.LocalDate;

public class Subscription {
    public static LocalDate getSubscription(int amount){
        LocalDate expireDate = LocalDate.now();
        if (amount == 5) {
            expireDate = expireDate.plusWeeks(1);
        } else if (amount == 15) {
            expireDate = expireDate.plusMonths(1);
        } else if (amount == 25) {
            expireDate = expireDate.plusMonths(2);
        } else if (amount == 60) {
            expireDate = expireDate.plusYears(1);
        }

        return expireDate;
    }
}
