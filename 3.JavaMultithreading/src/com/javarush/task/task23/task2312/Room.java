package com.javarush.task.task23.task2312;

import java.util.List;

public class Room {
    public static Room game;

    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        Snake snake = new Snake(5, 5);
        snake.setDirection(SnakeDirection.DOWN);
        game = new Room(10, 10, snake);
        game.createMouse();
        game.run();
        game.print();
    }

    public void run() {

    }

    public void print() {
        int[][] matrix = new int[height][width];
        String[] symbols = {".", "x", "X", "^", "RIP"};

        List<SnakeSection> sections = snake.getSections();
        for (SnakeSection section : sections) {
            matrix[section.getY()][section.getX()] = 1;
        }
        matrix[snake.getY()][snake.getX()] = snake.isAlive() ? 2 : 4;
        matrix[mouse.getY()][mouse.getX()] = 3;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int index = matrix[y][x];
                System.out.print(symbols[index]);
            }
            System.out.println();
        }

    }

    public void createMouse() {
        mouse = new Mouse((int) (Math.random() * width), (int) (Math.random() * height));
    }

    public void eatMouse() {
        createMouse();
    }

    public void sleep() {
        try {
            int lvl = snake.getSections().size();
//            if (lvl == 1) {
//                Thread.sleep(500);
//            } else if (lvl == 11) {
//                Thread.sleep(300);
//            } else if (lvl > 15) {
//                Thread.sleep(200);
//            }

            int delay = lvl < 15 ? (520 - lvl * 20) : 200;
            Thread.sleep(delay);

        } catch (InterruptedException ignore) {

        }
    }

}
