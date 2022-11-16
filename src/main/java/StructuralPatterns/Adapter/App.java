package StructuralPatterns.Adapter;

public class App {
    public static void main(String[] args) {
        CreditCard creditCard = new MyBankCreditCard();

        System.out.println(creditCard.validateCard("VALID_NUMBER"));

    }
}
