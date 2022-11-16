package BehavioralPatterns.ChainOfResponsibility;

public abstract class AbstractSupportHandler {
    protected AbstractSupportHandler nextHandler;

    protected RequestLevel level;

    public void setNextHandler(AbstractSupportHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    abstract protected void handleRequest(String message);

    public void receiveRequest(RequestLevel level, String message){
        if (canHandleRequest(level))
            handleRequest(message);
        else
            nextHandler.receiveRequest(level,message);
    }

    private boolean canHandleRequest(RequestLevel level){
        return this.level.ordinal() <= level.ordinal();
    }
}
