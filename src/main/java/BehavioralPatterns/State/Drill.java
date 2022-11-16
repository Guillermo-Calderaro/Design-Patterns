package BehavioralPatterns.State;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Drill {
    private State state;

    public Drill() {
        this.state = new OffState(this);
    }


    public void start(){
        state.onIgnite();
    }

    public void stop(){
        state.onStop();
    }

    public void lock(){
        state.onLock();
    }
    public void unLock(){
        state.onUnlock();
    }


}
