package CreationalPatterns.AbstractFactory.Chair;

import lombok.extern.java.Log;

@Log
public class ModernChair implements Chair{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitsOn() {
        log.info("By all means");
    }
}
