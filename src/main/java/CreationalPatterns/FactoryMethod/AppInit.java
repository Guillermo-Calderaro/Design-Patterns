package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.proyect.FrontEndProyect;
import CreationalPatterns.FactoryMethod.proyect.Proyect;

public class AppInit {

    public static void main(String[] args) {
        Proyect proyect = new FrontEndProyect(2);
        proyect.handleProyect();
    }
}
