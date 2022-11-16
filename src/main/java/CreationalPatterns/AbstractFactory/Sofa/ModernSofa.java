package CreationalPatterns.AbstractFactory.Sofa;

import lombok.extern.java.Log;

@Log
public class ModernSofa implements Sofa{
    @Override
    public boolean isConfortable() {
        return false;
    }

    @Override
    public void sitsOn() {
        log.info("Excuse me!??");
    }
}
