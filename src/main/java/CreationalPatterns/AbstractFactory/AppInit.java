package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Chair.Chair;
import CreationalPatterns.AbstractFactory.Factories.ArtDecoFurnitureFactory;
import CreationalPatterns.AbstractFactory.Factories.FurnitureFactory;
import CreationalPatterns.AbstractFactory.Factories.ModernFurnitureFactory;
import CreationalPatterns.AbstractFactory.Factories.VictorianFurnitureFactory;
import lombok.extern.java.Log;

@Log
public class AppInit {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();

        Chair chair = furnitureFactory.createChair();
        chair.sitsOn();
    }
}
