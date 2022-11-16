package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Priceable{

    private List<Priceable> components;

    public Box(){
        this.components = new ArrayList<>();
    }

    @Override
    public double price() {
        return components.stream().map(each->each.price()).reduce(0.0, Double::sum);
    }

    @Override
    public void addElement(Priceable priceable){
        components.add(priceable);
    }

    @Override
    public void removeElement(Priceable priceable){
        components.remove(priceable);
    }

}
