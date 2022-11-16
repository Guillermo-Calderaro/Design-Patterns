package BehavioralPatterns.ChainOfResponsibility;

public class TechnicalSupportHandler extends AbstractSupportHandler{
    public TechnicalSupportHandler(RequestLevel level){
        this.level = level;
    }
    @Override
    protected void handleRequest(String message) {
        System.out.println("TechnicalSupportHandler: Processing request " + message);
    }
}
