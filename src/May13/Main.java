package May13;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int amount = 15;

        LocalDate expirationDate = Subscription.getSubscription(amount);

        System.out.println("Subscription amount: " + amount);
        System.out.println("Expiration date: " + expirationDate);
    }
}
