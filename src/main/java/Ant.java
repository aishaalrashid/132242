package main.java;

import java.awt.*;

/**
 * Created by chaic on 15/03/2016.
 */
public class Ant {

    private int ID;
    private Color color;
    private int state;
    private int currentDirection;
    private int resting;
    private boolean hasFood;

    public Ant(int ID, Color color){
        this.ID = ID;
        this.color = color;
        state = 0;
        currentDirection = 0;
        resting = 0;
        hasFood = false;
    }

    public int getID(){
        return ID;
    }

    public Color getColor(){
        return color;
    }

    public void setState(int state){
        this.state = state;
    }

    public int getState(){
        return state;
    }

    public void setCurrentDirection(int direction){
        currentDirection = direction;
    }

    public int getCurrentDirection(){
        return currentDirection;
    }

    public void setResting(int resting){
        this.resting = resting;
    }

    public int getResting(){
        return resting;
    }

    public void setHasFood(boolean hasFood){
        this.hasFood = true;
    }

    public boolean hasFood(){
        return hasFood;
    }
}
