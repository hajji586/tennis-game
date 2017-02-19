package src.test.java;

import java.util.Arrays;
import java.util.List;

public class Player {

    public static final List<String> pointsDescription = Arrays.asList("zero", "fifteen", "thirty", "forty");

    private int score;
    public int getScore() {
        return score;
    }
    String name;
    public String getName() {
        return name;
    }

    public void winBall() {
        this.score = this.score + 1;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getScoreDescription(){
        return pointsDescription.get(score);
    }
}
