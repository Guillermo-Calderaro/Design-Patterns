package BehavioralPatterns.State;

public class LockState extends State{

    public LockState(Drill drill) {
        super(drill);
    }

    @Override
    public void onIgnite() {
        //Do nothing
    }

    @Override
    public void onStop() {
        //Do nothing
    }

    @Override
    public void onLock() {
        //Do nothing
    }

    @Override
    public void onUnlock() {
        System.out.println("Unlocking the drill");
        this.drill.setState(new OffState(drill));
    }
}
