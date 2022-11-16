package BehavioralPatterns.State;

public class App {
    public static void main(String[] args) {
        Drill drill = new Drill();
        //drill.lock();
        drill.stop();
        drill.start();
        drill.lock();
        drill.stop();

    }
}
