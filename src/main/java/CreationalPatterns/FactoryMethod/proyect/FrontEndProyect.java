package CreationalPatterns.FactoryMethod.proyect;

import CreationalPatterns.FactoryMethod.developer.Developer;
import CreationalPatterns.FactoryMethod.developer.FrontEndDeveloper;

public class FrontEndProyect extends Proyect{

    public FrontEndProyect(int amountOfProgramers){
        super(amountOfProgramers);
    }
    @Override
    public Developer getDeveloperFactory() {
        return new FrontEndDeveloper();
    }

}
