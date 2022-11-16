package BehavioralPatterns.Mediator;

//colleagues only know about the mediator
public abstract class ArmedUnit {
    protected Commander commander;
    public ArmedUnit(Commander commander) {
        this.commander=commander;
    }

    public abstract void attack();
    public abstract void stopAttack();
}
