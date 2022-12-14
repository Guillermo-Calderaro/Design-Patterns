package BehavioralPatterns.Observer;

import java.math.BigDecimal;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setBidAmount(Observer observer, BigDecimal newBidAmount);
}
