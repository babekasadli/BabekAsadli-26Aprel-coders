package iyun6;

import java.time.LocalDate;

public class Card {
    private User user;
    private String cardNumber;
    private LocalDate expirationDate;

    private double balance;

    public Card(User user, String cardNumber, LocalDate expirationDate, double balance) {
        this.user = user;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
