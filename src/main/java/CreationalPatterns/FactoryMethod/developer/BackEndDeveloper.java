package CreationalPatterns.FactoryMethod.developer;

public class BackEndDeveloper implements Developer{
    @Override
    public void code() {
        System.out.println("I'm coding");
    }

    @Override
    public void codeLikeHell() {
        System.out.println("I'm coding like hell");
    }

    @Override
    public void estimate() {
        System.out.println("I'm sleeping");
    }

    @Override
    public void refactor() {
        System.out.println("I'm sleeping");
    }
}
