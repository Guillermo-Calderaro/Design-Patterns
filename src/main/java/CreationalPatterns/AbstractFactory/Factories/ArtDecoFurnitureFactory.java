package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Chair.ArtDecoChair;
import CreationalPatterns.AbstractFactory.Chair.Chair;
import CreationalPatterns.AbstractFactory.CoffeTable.ArtDecoCoffeTable;
import CreationalPatterns.AbstractFactory.CoffeTable.CoffeTable;
import CreationalPatterns.AbstractFactory.Sofa.ArtDecoSofa;
import CreationalPatterns.AbstractFactory.Sofa.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
