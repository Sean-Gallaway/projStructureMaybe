package Gamelogic;

import java.util.LinkedList;
import java.util.Queue;

// class should be static.
public class Controller {
    public static Queue<Player> turnOrder = new LinkedList<>();

    // take head of queue, if Opponent, ask it for any actions. if Player, take actions until end turn is pressed.
    // then, add the Player to the end of the queue.
    void process () {

    }
}
