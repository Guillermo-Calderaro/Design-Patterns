package StructuralPatterns.Decorator;

public class AppInit {
    public static void main(String[] args) {
        VisualComponent visualComponent = new TextView();

        visualComponent.draw("This is a sample text");


        BorderDecorator visualComponent1 = new BorderDecorator();
        ScrollDecorator visualComponent2 = new ScrollDecorator();

        visualComponent1.setVisualComponent(visualComponent);
        visualComponent2.setVisualComponent(visualComponent1);

        visualComponent2.draw("Yet another sample text");


    }
}
