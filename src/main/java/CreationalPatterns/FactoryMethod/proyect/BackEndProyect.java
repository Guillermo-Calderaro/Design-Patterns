package CreationalPatterns.FactoryMethod.proyect;

import CreationalPatterns.FactoryMethod.developer.BackEndDeveloper;
import CreationalPatterns.FactoryMethod.developer.Developer;

public class BackEndProyect extends Proyect {
    public BackEndProyect(int amountOfProgramers) {
        super(amountOfProgramers);
    }

    @Override
    public Developer getDeveloperFactory() {
        return new BackEndDeveloper();
    }

    @Override
    public void handleProyect(){
        for (int i = 0; i< this.amountOfProgrammers; i++){
            getDeveloperFactory().codeLikeHell();
        }
    }
}
