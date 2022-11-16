package StructuralPatterns.Composite;

import lombok.extern.java.Log;


@Log()
public class InitApp {

    public static void main(String[] args) {
        Priceable box = new Box();
        Priceable insideBox = new Box();
        Priceable shoes = new Product(12000.00);
        Priceable shirt = new Product(5000.00);

        log.info("Shoes: " + Double.toString(shoes.price()));
        log.info(Double.toString(shirt.price()));
        log.info(Double.toString(box.price()));

        box.addElement(shoes);
        box.addElement(shirt);
        log.info(Double.toString(box.price()));

        insideBox.addElement(new Product(3000.00));
        box.addElement(insideBox);
        log.info(Double.toString(box.price()));
    }
}
