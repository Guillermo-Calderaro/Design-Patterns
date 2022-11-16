package CreationalPatterns.FactoryMethod.developer;

public class FrontEndDeveloper implements Developer{
    @Override
    public void code()  {
        System.out.println("I'm drinking coffee");
    }

    @Override
    public void codeLikeHell()  {
        System.out.println("I'm coding");
    }

    @Override
    public void estimate()  {
        System.out.println("I'm estimating");
    }

    @Override
    public void refactor() {
            System.out.println("I'm refactoring");
    }
}
