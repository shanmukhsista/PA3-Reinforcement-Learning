package com.company;

import java.util.HashMap;

/**
 * Created by shanmukh on 11/14/15.
 */
public class QGridSquare {
    private HashMap<Integer, Double> actionsMap;
    public void setActionForState(int action, double value){
        this.actionsMap.put(action, value);
    }
    public double getActionValue(int action){
        return this.actionsMap.get(action);
    }
}
