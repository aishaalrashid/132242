package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chaic on 25/03/2016.
 */
public class AntBrain {

    private Pattern sensePattern = Pattern.compile("Sense\\s(Here|Ahead|LeftAhead|RightAhead)\\s\\d\\s\\d");
    private Pattern markPattern = Pattern.compile("Mark\\s\\d\\s\\d");

    private Pattern all = Pattern.compile(sensePattern + "|" + markPattern);

    public boolean check(String input){
        Matcher allMatcher = all.matcher(input);
        return allMatcher.matches();
    }

}
