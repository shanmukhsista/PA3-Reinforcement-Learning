package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ActionEffects ae = new ActionEffects();

        Effect up = new Effect(Actions.UP);
        up.addActionEffect(Actions.UP, 0.8 );
        up.addActionEffect(Actions.LEFT, .2);

        Effect right = new Effect(Actions.RIGHT);
        right.addActionEffect(Actions.RIGHT, 0.8 );
        right.addActionEffect(Actions.DOWN, 0.2);



        Effect left = new Effect(Actions.LEFT);
        left.addActionEffect(Actions.LEFT, 1.0);



        Effect down = new Effect(Actions.DOWN);
        down.addActionEffect(Actions.DOWN, 1.0);


        ae.actionEffects.put(up.action, up);
        ae.actionEffects.put(right.action, right);
        ae.actionEffects.put(left.action, left);
        ae.actionEffects.put(down.action, down);

        QGrid qg = new QGrid(5, 5, ae);
        qg.PrintGridActions();


    }
}
