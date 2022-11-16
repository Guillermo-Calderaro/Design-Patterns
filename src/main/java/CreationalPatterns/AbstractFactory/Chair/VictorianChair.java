package CreationalPatterns.AbstractFactory.Chair;

import lombok.extern.java.Log;

@Log
public class VictorianChair implements Chair{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitsOn() {
        log.info("Heavy the weigth...");
    }
}
