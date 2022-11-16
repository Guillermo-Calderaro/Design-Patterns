package BehavioralPatterns.ChainOfResponsibility;

public class BillingSupportHandler extends AbstractSupportHandler{

    public BillingSupportHandler(RequestLevel level){
        this.level = level;
    }
    @Override
    protected void handleRequest(String message) {
        System.out.println("BillingSupportHandler: Processing request. " + message);
    }
}
