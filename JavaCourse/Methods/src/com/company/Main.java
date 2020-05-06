package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800, levelCompleted = 5, bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("playerOne", calculateHighScorePosition(1500));
        displayHighScorePosition("playerTwo", calculateHighScorePosition(900));
        displayHighScorePosition("playerThree", calculateHighScorePosition(400));
        displayHighScorePosition("playerFour", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " got to position " + position);
    }

    public static int calculateHighScorePosition(int score) {
       /* if (score >= 1000)
            return 1;
        if (score >= 500)
            return 2;
        if (score >= 100)
            return 3;

        return 4;*/

        int position = 4;

        if (score >= 1000)
            position = 1;
        if (score >=500)
            position = 2;
        if (score >= 100)
            position = 3;

        return position;
    }
}
