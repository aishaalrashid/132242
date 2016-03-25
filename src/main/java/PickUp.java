package main.java;

/**
 * Created by chaic on 25/03/2016.
 */
public class PickUp extends Instruction implements Token {

    private int state1;
    private int state2;

    public PickUp(int state1, int state2){
        this.state1 = state1;
        this.state2 = state2;
    }
}
