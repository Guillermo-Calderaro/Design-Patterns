package BehavioralPatterns.State;

public class OffState extends State {

    public OffState(Drill drill) {
        super(drill);
    }

    @Override
    public void onIgnite() {
        System.out.println("Starting the drill");
        this.drill.setState(new OnState(drill));
    }

    @Override
    public void onStop() {
        //Do nothing.
    }

    @Override
    public void onLock() {
        System.out.println("Locking the drill");
        this.drill.setState(new LockState(drill));
    }

    @Override
    public void onUnlock() {
        //Do nothing
    }


}
