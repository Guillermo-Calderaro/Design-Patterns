package StructuralPatterns.Adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class MyBankCreditCard implements CreditCard{
    @Override
    public boolean validateCard(String creditCardNumber) {
        return "VALID_NUMBER".equals(creditCardNumber);
    }

    @Override
    public List<Transaction> getTransactionsFromClient(String creditCardNumber) {
        return new ArrayList<>();
    }
}
