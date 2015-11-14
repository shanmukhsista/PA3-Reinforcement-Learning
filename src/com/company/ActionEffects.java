package com.company;

import java.util.HashMap;

/**
 * Created by shanmukh on 11/14/15.
 */
public class ActionEffects {
    public HashMap<Integer, Effect> actionEffects ;
    public ActionEffects(){
        actionEffects= new HashMap<>();
    }

    @Override
    public String toString() {
        String r = "";
        for ( int action : actionEffects.keySet()){
            Effect e = actionEffects.get(action);
            r += e.toString() ;
        }
        return r ;
    }
}
/*
    An action effect class is used to represent the effect of an action. An action can result into multiple actions
    with different probabiltiy
 */
class Effect{
    public int action ;
    public HashMap<Integer, Double> actionProbabilities ;
    public Effect(int forAction){
        action = forAction;
        actionProbabilities = new HashMap<>();
    }
    public void addActionEffect(int probableAction, double probability){
        this.actionProbabilities.put(probableAction,     probability);
    }

    @Override
    public String toString() {
        String returnS = "";
        returnS += "Action : " + Actions.actionsLabel.get(this.action) + " \n";
        for ( int action : this.actionProbabilities.keySet()){
            returnS += "\t";
           returnS += "--" + Actions.actionsLabel.get(action) + " -> " + actionProbabilities.get(action) + "\n";
        }
        return returnS;
    }
}