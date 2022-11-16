package CreationalPatterns.FactoryMethod.proyect;

import CreationalPatterns.FactoryMethod.developer.Developer;

public abstract class Proyect {

    protected int amountOfProgrammers = 0;

    public Proyect(int amountOfProgrammers){
        this.amountOfProgrammers = amountOfProgrammers;
    }
    public abstract Developer getDeveloperFactory();

    public void handleProyect(){
        for (int i = 0; i< this.amountOfProgrammers; i++){
            getDeveloperFactory().code();
        }
    }
}
