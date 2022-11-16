package BehavioralPatterns.Memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class PlayerCaretaker {
    final Deque<PlayerMemento> mementos = new ArrayDeque<>();
    public PlayerMemento getMemento()
    {
        PlayerMemento playerMemento = mementos.pop();
        return playerMemento;
    }
    public void addMemento(PlayerMemento memento)
    {
        mementos.push(memento);
    }
}
