package CreationalPatterns.AbstractFactory.Chair;

import lombok.extern.java.Log;

@Log
public class ArtDecoChair implements Chair{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitsOn() {
        log.info("Oh my!");
    }
}
