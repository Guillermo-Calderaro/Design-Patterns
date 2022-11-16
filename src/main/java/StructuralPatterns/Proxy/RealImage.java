package StructuralPatterns.Proxy;

public class RealImage implements Image{
    private String fileName;
    private String description;

    public RealImage(String fileName, String description){
        this.fileName = fileName;
        this.description = description;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }

    @Override
    public String getDescription() {
        return description;
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading "+fileName);
    }
}
