package com.ingconti;



public class Player {

    private int x = 0;
    private int y = 0;

    boolean moveRight(){
        if (x<5) {
            x+=1;
            return  true;
        }
        return  false;
    }


    boolean moveUp(){
        if (y<5) {
            y+=1;
            return  true;
        }
        return  false;
    }


    boolean applyToMe(Effect e){

        e.applyOn(this);
        return true;
    }

    void showStatus(){
        System.out.println( x);
        System.out.println( y);
        System.out.println( "-------");

    }
}