package StructuralPatterns.Decorator;

import lombok.extern.java.Log;

@Log
public class BorderDecorator extends Decorator{

    public BorderDecorator(){
        super();
    }
    @Override
    void draw(String text) {
        log.info("Displaying border...");
        this.getVisualComponent().draw(text);
    }
}
