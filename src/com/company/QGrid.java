package com.company;

import java.util.HashMap;

/**
 * Created by shanmukh on 11/14/15.
 */
public class QGrid {
    public double discount = 0.9;
    public QGridSquare[][] states;
    public ActionEffects gridActions ;
    public QGrid( int rows, int columns , ActionEffects gridActions ){
        states = new QGridSquare[rows][columns];
        this.gridActions = gridActions;
    }
    public void PrintGridActions(){
        //Print actions and thier probabilitiies for this grid.
        System.out.println(this.gridActions.toString());
    }
}
