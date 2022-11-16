package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Chair.Chair;
import CreationalPatterns.AbstractFactory.Chair.VictorianChair;
import CreationalPatterns.AbstractFactory.CoffeTable.CoffeTable;
import CreationalPatterns.AbstractFactory.CoffeTable.VictorianCoffeTable;
import CreationalPatterns.AbstractFactory.Sofa.Sofa;
import CreationalPatterns.AbstractFactory.Sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
