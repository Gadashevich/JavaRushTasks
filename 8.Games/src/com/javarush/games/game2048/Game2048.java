package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static  final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE,SIDE);
        createGame();
        drawScene();
    }

    private void createGame(){

    }

    private void drawScene(){
        for (int y = 0; y <SIDE ; y++) {
            for (int x = 0; x < SIDE; x++) {
                setCellColor(x, y, Color.RED);
            }
        }
    }


}
