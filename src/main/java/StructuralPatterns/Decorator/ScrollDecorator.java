package StructuralPatterns.Decorator;

import lombok.extern.java.Log;

@Log
public class ScrollDecorator extends Decorator{

    public ScrollDecorator(){
        super();
    }
    @Override
    void draw(String text) {
        log.info("Displaying scroll...");
        this.getVisualComponent().draw(text);
    }
}
