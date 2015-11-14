package com.company;

import java.util.HashMap;

/**
 * Created by shanmukh on 11/14/15.
 */
public class Actions {
    public static int UP= 1;
    public static int DOWN= 3;
    public static int RIGHT = 0;
    public static int LEFT  =2 ;
    public static HashMap<Integer, String> actionsLabel ;
    static{
        actionsLabel  = new HashMap<>();
        actionsLabel.put(Actions.UP, "Up");
        actionsLabel.put(Actions.LEFT, "Left");
        actionsLabel.put(Actions.RIGHT, "Right");
        actionsLabel.put(Actions.DOWN, "Down");
    }
}
