package main.java;

/**
 * Created by chaic on 25/03/2016.
 */
public class UnMark extends Instruction implements Token {

    private int i;
    private int state1;

    public UnMark(int i, int state1){
        this.i = i;
        this.state1 = state1;
    }
}
