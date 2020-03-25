package com.ingconti;


import java.util.ArrayList;

public class Game {


    Effect eff1 = (p) -> {
        p.moveRight();
    };

    Effect eff2 = (p) -> {
        p.moveRight();
        p.moveUp();
        p.moveRight();

    };

    public void run() {
        Player p1 = new Player();
        p1.applyToMe(eff1);
        p1.showStatus();

        Player p2 = new Player();
        p2.applyToMe(eff2);
        p2.showStatus();

    }
}
