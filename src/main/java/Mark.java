package main.java;

/**
 * Created by chaic on 25/03/2016.
 */
public class Mark extends Instruction implements Token {

    private int i;
    private int state1;

    public Mark(int i, int state1){
        this.i = i;
        this.state1 = state1;
    }
}
