package StructuralPatterns.Adapter;

import java.util.List;

public interface CreditCard {
    boolean validateCard(String creditCardNumber);

    List<Transaction> getTransactionsFromClient(String creditCardNumber);
}
