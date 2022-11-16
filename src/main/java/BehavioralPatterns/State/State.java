package BehavioralPatterns.State;

public abstract class State {
    Drill drill;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Drill drill) {
        this.drill = drill;
    }

    public abstract void onIgnite();
    public abstract void onStop();

    public abstract void onLock();
    public abstract void onUnlock();
}
