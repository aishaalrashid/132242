package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chaic on 25/03/2016.
 */
public class AntBrain {

    private Pattern state = Pattern.compile("([0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9])");
    private Pattern pathValue = Pattern.compile("[0-5]");
    private Pattern p = Pattern.compile("[0-9]*");
    private Pattern lr = Pattern.compile("(Left|Right)");

    private Pattern sensedir = Pattern.compile("(Here|Ahead|LeftAhead|RightAhead)");
    private Pattern cond = Pattern.compile("(Friend|Foe|FriendWithFood|FoeWithFood|Food|Rock|Marker" + "\\s" + pathValue + "|FowMarker|Home|FoeHome)");

    private Pattern sensePattern = Pattern.compile("Sense\\s" + sensedir + "\\s" + state + "\\s" + state + "\\s" + cond );
    private Pattern markPattern = Pattern.compile("Mark\\s" + pathValue + "\\s" + state);
    private Pattern unmarkPattern = Pattern.compile("Unmark\\s" + pathValue + "\\s" + state);
    private Pattern pickupPattern = Pattern.compile("PickUp\\s" + state + "\\s" + state);
    private Pattern dropPattern = Pattern.compile("Drop\\s" + state);
    private Pattern turnPattern = Pattern.compile("Turn\\s" + lr + "\\s" + state);
    private Pattern movePattern = Pattern.compile("Move\\s" + state + "\\s" + state);
    private Pattern flipPattern = Pattern.compile("Flip\\s" + p + "\\s" + state + "\\s" + state);




    private Pattern all = Pattern.compile(sensePattern + "|" + markPattern + "|" + unmarkPattern + "|" + pickupPattern + "|" + dropPattern + "|" + turnPattern + "|" + movePattern + "|" + flipPattern);

    public boolean checkInstruction(String input){
        Matcher allMatcher = all.matcher(input);
        return allMatcher.matches();
    }

}
