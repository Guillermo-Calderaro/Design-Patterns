package StructuralPatterns.Proxy;

public class App {
    public static void main(String[] args) {
        Image image = new ProxyImage("myImage.png", "Funny Image");

        //handled by the proxy
        image.getDescription();

        //delegated to the real object
        image.display();
    }
}
