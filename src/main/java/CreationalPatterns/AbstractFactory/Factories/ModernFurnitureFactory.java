package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Chair.Chair;
import CreationalPatterns.AbstractFactory.Chair.ModernChair;
import CreationalPatterns.AbstractFactory.CoffeTable.CoffeTable;
import CreationalPatterns.AbstractFactory.CoffeTable.ModernCoffeTable;
import CreationalPatterns.AbstractFactory.Sofa.ModernSofa;
import CreationalPatterns.AbstractFactory.Sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
