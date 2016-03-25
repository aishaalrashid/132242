package main.java;

/**
 * Created by chaic on 25/03/2016.
 */
public class Flip extends Instruction implements Token {

    private int p;
    private int state1;
    private int state2;

    public Flip(int p, int state1, int state2){
        this.p = p;
        this.state1 = state1;
        this.state2 = state2;
    }
}
