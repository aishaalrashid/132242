package main.java;

/**
 * Created by chaic on 25/03/2016.
 */
public class Sense extends Instruction implements Token {

    private SenseDir senseDir;
    private int state1;
    private int state2;
    private Cond cond;

    public Sense(SenseDir senseDir, int state1, int state2, Cond cond){
        this.senseDir = senseDir;
        this.state1 = state1;
        this.state2 = state2;
        this.cond = cond;
    }
}
