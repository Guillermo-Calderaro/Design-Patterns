package StructuralPatterns.Composite;

public interface Priceable {
    double price();

    void addElement(Priceable element);

    void removeElement(Priceable element);
}
