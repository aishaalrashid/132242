package main.java;

/**
 * Created by chaic on 25/03/2016.
 */
public class Drop extends Instruction implements Token {

    private int state1;

    public Drop(int state1){
        this.state1 = state1;
    }
}
