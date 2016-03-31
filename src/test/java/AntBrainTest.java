package test.java;

import junit.framework.TestCase;
import main.java.Ant;
import main.java.AntBrain;

import java.util.regex.Pattern;

/**
 * Created by chaic on 31/03/2016.
 */
public class AntBrainTest extends TestCase {


    public void testCheckSenseInstruction(){
        AntBrain antBrain = new AntBrain();

        String senseInstruction = "Sense Ahead 1 2";
        boolean result = antBrain.check(senseInstruction);
        assertTrue(result);
    }

    public void testCheckMarkInstruction(){
        AntBrain antBrain = new AntBrain();

        String markInstruction = "Mark 1 5";
        boolean result = antBrain.check(markInstruction);
        assertTrue(result);
    }
}