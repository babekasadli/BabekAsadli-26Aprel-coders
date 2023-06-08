package iyun6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws Exception {
        User user1 = new User("John", "Doe");
        User user2 = new User("Jane", "Smith");

        // Create some cards
        Card card1 = new Card(user1, "1234567890123456", LocalDate.of(2023, 12, 31), 1000.52);
        Card card2 = new Card(user2, "9876543210987654", LocalDate.of(2024, 6, 30), 652.76);

        // Add cards to the list
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);

        // Perform money transfer
        try {
            transferMoney(card1, card2, 100.0, cardList);
        } catch (Exception e) {
            System.out.println("An error occurred during the transfer: " + e.getMessage());
        }
    }
    public static void transferMoney(Card senderCard, Card receiverCard, double amount, List<Card> cardList) throws Exception {
        // Check if sender and receiver cards exist in the list
        Optional<Card> senderOptional = cardList.stream()
                .filter(card -> card == senderCard)
                .findFirst();
        Optional<Card> receiverOptional = cardList.stream()
                .filter(card -> card == receiverCard)
                .findFirst();

        // Check if sender card and receiver card exist
        if (senderOptional.isEmpty() || receiverOptional.isEmpty()) {
            throw new Exception("Invalid sender or receiver card.");
        }

        // Check if the card number is 16 digits long
        if (senderCard.getCardNumber().length() != 16 || receiverCard.getCardNumber().length() != 16) {
            throw new Exception("Invalid card number.");
        }

        // Check if the expiration date has passed
        LocalDate currentDate = LocalDate.now();
        if (senderCard.getExpirationDate().isBefore(currentDate) || receiverCard.getExpirationDate().isBefore(currentDate)) {
            throw new Exception("Card has expired.");
        }

        // Check if sender has sufficient amount
        if (amount > 0 && amount <=  senderCard.getBalance()) {
            senderCard.setBalance(senderCard.getBalance() - amount);
            receiverCard.setBalance(receiverCard.getBalance() + amount);
            System.out.println("Money transfer successful.");
        } else {
            throw new Exception("Insufficient funds.");
        }
    }
}
