package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private List<GameObject> snakeParts = new ArrayList<>();
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        Color colorSnake = isAlive ? Color.BLACK : Color.RED;
        for (int i = 0; i < snakeParts.size(); i++) {
            String string = i == 0 ? HEAD_SIGN : BODY_SIGN;
            GameObject snakePart = snakeParts.get(i);
            game.setCellValueEx(snakePart.x, snakePart.y,Color.NONE, string,colorSnake,75 );
        }
    }

    public void move(){

    }

    public GameObject createNewHead() {
        GameObject oldHead = snakeParts.get(0);
        if (direction.equals(Direction.LEFT)) {
            return new GameObject(oldHead.x - 1, oldHead.y);
        } else if (direction.equals(Direction.RIGHT)) {
            return new GameObject(oldHead.x + 1, oldHead.y);
        } else if (direction.equals(Direction.UP)) {
            return new GameObject(oldHead.x, oldHead.y - 1);
        } else {
            return new GameObject(oldHead.x, oldHead.y + 1);
        }
    }

    public  void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

}