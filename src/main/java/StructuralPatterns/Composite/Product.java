package StructuralPatterns.Composite;


public class Product implements Priceable{
    private double price;

    public Product(double price){
        this.price = price;
    }

    @Override
    public double price() {
        return this.price;
    }

    @Override
    public void addElement(Priceable element) {}

    @Override
    public void removeElement(Priceable element) {}
}
