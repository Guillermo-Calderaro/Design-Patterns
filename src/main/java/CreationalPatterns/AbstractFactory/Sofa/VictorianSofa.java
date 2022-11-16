package CreationalPatterns.AbstractFactory.Sofa;

import lombok.extern.java.Log;

@Log
public class VictorianSofa implements Sofa{
    @Override
    public boolean isConfortable() {
        return true;
    }

    @Override
    public void sitsOn() {
        log.info("Heavy the weigth...");
    }
}