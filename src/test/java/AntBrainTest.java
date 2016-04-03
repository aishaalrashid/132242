package test.java;

import junit.framework.TestCase;
import main.java.AntBrain;

/**
 * Created by chaic on 31/03/2016.
 */
public class AntBrainTest extends TestCase {


    public void testCheckSenseInstruction(){
        AntBrain antBrain = new AntBrain();

        String senseInstruction = "Sense Ahead 1 2 Foe";
        boolean result = antBrain.checkInstruction(senseInstruction);
        assertTrue(result);
    }

    public void testStateValueLimit(){
        AntBrain antBrain = new AntBrain();

        String invalidSenseInstruction = "Sense Ahead 1 100000 Foe"; //Exceeds 9999 -> Should fail
        boolean result = antBrain.checkInstruction(invalidSenseInstruction);
        assertFalse(result);
    }

    public void testCondMarker(){
        AntBrain antBrain = new AntBrain();

        String senseWithMarkerCond = "Sense Ahead 1 4 Marker 3";
        boolean result = antBrain.checkInstruction(senseWithMarkerCond);
        assertTrue(result);
    }


    public void testCheckMarkInstruction(){
        AntBrain antBrain = new AntBrain();

        String markInstruction = "Mark 1 5";
        boolean result = antBrain.checkInstruction(markInstruction);
        assertTrue(result);
    }

    public void testPathValueLimit(){
        AntBrain antBrain = new AntBrain();

        String markInstruction = "Mark 6 13"; // 6 > max path value
        boolean result = antBrain.checkInstruction(markInstruction);
        assertFalse(result);
    }

    public void testCheckUnMarkInstruction(){
        AntBrain antBrain = new AntBrain();

        String unmarkInstruction = "Unmark 3 2";
        boolean result = antBrain.checkInstruction(unmarkInstruction);
        assertTrue(result);
    }

    public void testCheckPickUpIntstruction(){
        AntBrain antBrain = new AntBrain();

        String pickupInstruction = "PickUp 3 4";
        Boolean result = antBrain.checkInstruction(pickupInstruction);
        assertTrue(result);
    }

    public void testCheckDropInstruction(){
        AntBrain antBrain = new AntBrain();

        String dropInstruction = "Drop 20";
        boolean result = antBrain.checkInstruction(dropInstruction);
        assertTrue(result);
    }

    public void testCheckTurnInstruction(){
        AntBrain antBrain = new AntBrain();

        String turnInstruction = "Turn Left 60";
        boolean result = antBrain.checkInstruction(turnInstruction);
        assertTrue(result);
    }

    public void testCheckMoveInstruction(){
        AntBrain antBrain = new AntBrain();

        String moveInstruction = "Move 7 22";
        boolean result = antBrain.checkInstruction(moveInstruction);
        assertTrue(result);
    }

    public void testCheckFlipInstruction(){
        AntBrain antBrain = new AntBrain();

        String flipInstruction = "Flip 555 92 95";
        boolean result = antBrain.checkInstruction(flipInstruction);
        assertTrue(result);
    }
}


