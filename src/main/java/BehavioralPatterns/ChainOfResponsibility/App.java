package BehavioralPatterns.ChainOfResponsibility;

public class App {
    public static void main(String[] args) {
        AbstractSupportHandler handler = RequestorClient.getHandlerChain();
        handler.receiveRequest(RequestLevel.TECHNICAL, " I'm having problem with my internet connectivity.");
        System.out.println("............................................");
        handler.receiveRequest(RequestLevel.BILLING, "Please resend my bill of this month.");
        System.out.println("............................................");
        handler.receiveRequest(RequestLevel.GENERAL, "Please send any other plans for home users.");
    }
}
