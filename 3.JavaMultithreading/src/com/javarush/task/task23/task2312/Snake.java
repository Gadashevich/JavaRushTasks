package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;

    private SnakeDirection direction;

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void checkBorders(SnakeSection head) {
        if (head.getX() >= Room.game.getWidth() ||
                head.getX() < 0 ||
                head.getY() < 0 ||
                head.getY() >= Room.game.getHeight()) {
            isAlive = false;
        }
    }

    public void checkBody(SnakeSection head) {
//       if(sections.contains(head)){
//           isAlive = false;
//       }
        isAlive = !sections.contains(head);
    }


    public void move() {
        if (!isAlive) {
            return;
        }
        if (direction == SnakeDirection.UP) {
            move(0, -1);
        } else if (direction == SnakeDirection.RIGHT) {
            move(1, 0);
        } else if (direction == SnakeDirection.DOWN) {
            move(0, 1);
        } else if (direction == SnakeDirection.LEFT) {
            move(-1, 0);
        }
    }


    public void move(int x, int y) {
        SnakeSection snakeHead = sections.get(0);
        int newX = snakeHead.getX() + x;
        int newY = snakeHead.getY() + y;
        snakeHead = new SnakeSection(newX, newY);

        checkBorders(snakeHead);
        checkBody(snakeHead);

        Mouse mouse = Room.game.getMouse();
        if (mouse.getX() == snakeHead.getX() &&
                mouse.getY() == snakeHead.getY()) {
            sections.add(0, snakeHead);
            Room.game.eatMouse();
        } else {
            sections.add(0, snakeHead);
            sections.remove(sections.size()-1);
        }


    }


    public List<SnakeSection> getSections() {
        return this.sections;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public SnakeDirection getDirection() {
        return this.direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
