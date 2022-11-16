package StructuralPatterns.Adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VisaCreditCardAdapter implements CreditCard{

    private VisaCreditCard visaCreditCard;


    @Override
    public boolean validateCard(String creditCardNumber) {
        return visaCreditCard.validateVisaCreditCard(creditCardNumber, new Date());
    }

    @Override
    public List<Transaction> getTransactionsFromClient(String creditCardNumber) {
        return visaCreditCard.getTransactionFromVisaClient(creditCardNumber);
    }
}
