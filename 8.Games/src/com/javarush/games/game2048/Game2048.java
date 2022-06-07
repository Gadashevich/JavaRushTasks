package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score;
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048) {
            win();
        }

        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int number = getRandomNumber(10);

        if (gameField[x][y] == 0) {
            if (number < 9) {
                gameField[x][y] = 2;
            } else {
                gameField[x][y] = 4;
            }
        } else {
            createNewNumber();
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color newColor = getColorByValue(value);
        String strValue = value > 0 ? "" + value : "";
        setCellValueEx(x, y, newColor, strValue);
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.WHITE;
            case 2:
                return Color.BLUE;
            case 4:
                return Color.PLUM;
            case 8:
                return Color.YELLOW;
            case 16:
                return Color.ORANGE;
            case 32:
                return Color.BROWN;
            case 64:
                return Color.GREEN;
            case 128:
                return Color.PURPLE;
            case 256:
                return Color.DARKGREEN;
            case 512:
                return Color.BLACK;
            case 1024:
                return Color.LIME;
            case 2048:
                return Color.AQUAMARINE;
            default:
                return Color.NONE;
        }
    }

    private boolean compressRow(int[] row) {
        int index = 0;
        boolean flag = false;
        for (int x = 0; x < row.length; x++) {
            if (row[x] > 0) {
                if (x != index) {
                    row[index] = row[x];
                    row[x] = 0;
                    flag = true;
                }
                index++;
            }
        }
        return flag;
    }

    private boolean mergeRow(int[] row) {
        boolean flag = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]) {
                row[i] = row[i + 1] * 2;
                row[i + 1] = 0;
                flag = true;
                score = score +row[i];
                setScore(score);
            }
        }
        return flag;
    }

    private void moveLeft() {
        boolean flag = false;
        for (int[] ints : gameField) {
            if (compressRow(ints) | mergeRow(ints) | compressRow(ints)) {
                flag = true;
            }
        }
        if (flag) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        int[][] newGameField = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                newGameField[j][SIDE - 1 - i] = gameField[i][j];
            }
        }
        gameField = newGameField;
    }

    private int getMaxTileValue() {
        int maxValue = gameField[0][0];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (gameField[i][j] > maxValue) {
                    maxValue = gameField[i][j];
                }
            }
        }
        return maxValue;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.NONE, "You win!", Color.GREEN, 75);
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.NONE, "You Lose!", Color.RED, 75);
    }

    private boolean canUserMove() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (gameField[i][j] == 0) {
                    return true;
                } else if (i < SIDE - 1 && gameField[i][j] == gameField[i + 1][j]) {
                    return true;
                } else if (j < SIDE - 1 && gameField[i][j] == gameField[i][j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                createGame();
                drawScene();
                score = 0;
                setScore(score);
            } else {
              return;
            }
        }

        if (!canUserMove()) {
            gameOver();
            return;
        }

        switch (key) {
            case LEFT:
                moveLeft();
                drawScene();
                break;
            case RIGHT:
                moveRight();
                drawScene();
                break;
            case UP:
                moveUp();
                drawScene();
                break;
            case DOWN:
                moveDown();
                drawScene();
                break;
        }

    }


}
