package StructuralPatterns.Adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisaCreditCard {

    public boolean validateVisaCreditCard(String creditCardNumber, Date currentDate){
        return "VALID_VISA_NUMBER".equals(creditCardNumber) && !currentDate.equals("");
    }

    public List<Transaction> getTransactionFromVisaClient(String creditCardNumber){
        return new ArrayList<>();
    }
}
