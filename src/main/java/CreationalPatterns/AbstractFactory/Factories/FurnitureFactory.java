package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Chair.Chair;
import CreationalPatterns.AbstractFactory.CoffeTable.CoffeTable;
import CreationalPatterns.AbstractFactory.Sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeTable createCoffeTable();
    Sofa createSofa();
}
