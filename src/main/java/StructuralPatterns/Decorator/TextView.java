package StructuralPatterns.Decorator;

import lombok.extern.java.Log;

@Log
public class TextView extends VisualComponent{
    @Override
    void draw(String text) {
        log.info("Displaying text: " + text);
    }
}