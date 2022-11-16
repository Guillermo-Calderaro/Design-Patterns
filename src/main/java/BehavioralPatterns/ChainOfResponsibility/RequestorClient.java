package BehavioralPatterns.ChainOfResponsibility;

public class RequestorClient {
    public  static AbstractSupportHandler getHandlerChain(){
        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(RequestLevel.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(RequestLevel.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(RequestLevel.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }
}
