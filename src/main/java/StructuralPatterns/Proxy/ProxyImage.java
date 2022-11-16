package StructuralPatterns.Proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;
    private String description;

    public ProxyImage(String fileName, String description){
        this.fileName = fileName;
        this.description = description;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName, description);
        }
        realImage.display();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
