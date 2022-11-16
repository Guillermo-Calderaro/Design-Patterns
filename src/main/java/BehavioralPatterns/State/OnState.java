package BehavioralPatterns.State;

public class OnState extends State{


    public OnState(Drill drill) {
        super(drill);
    }

    @Override
    public void onIgnite() {
        //Do Nothing
    }

    @Override
    public void onStop() {
        System.out.println("Stopping the drill");
        drill.setState(new OffState(drill));
    }

    @Override
    public void onLock() {
        //Do nothing
    }

    @Override
    public void onUnlock() {
        //Do nothing
    }


}
