package src.test.java;

import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GameTest {

    Player Monfils;
    Player Tsonga;
    Game game;

    @Before
    public void beforeGameTest() {
        Monfils = new Player("Monfils");
        Tsonga = new Player("Tsonga");
        game = new Game(Monfils, Tsonga);
    }

    @Test
    public void zeroShouldBeDescriptionForScore0() {
        Game game = new Game(Monfils, Tsonga);
        assertThat(game, hasProperty("score", is("zero, zero")));
    }

    @Test
    public void fifteenShouldBeDescriptionForScore1() {
        Tsonga.winBall();
        assertThat(game, hasProperty("score", is("zero, fifteen")));
    }

    @Test
    public void thirtyShouldBeDescriptionForScore2() {
        Monfils.winBall();
        Monfils.winBall();
        Tsonga.winBall();
        assertThat(game, hasProperty("score", is("thirty, fifteen")));
    }

    @Test
    public void fortyShouldBeDescriptionForScore3() {
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
                Monfils.winBall();
        });
        assertThat(game, hasProperty("score", is("forty, zero")));
    }

    @Test
    public void advantage() {
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            Monfils.winBall();
        });
        IntStream.rangeClosed(1, 4).forEach((Integer) -> {
            Tsonga.winBall();
        });
        assertThat(game, hasProperty("score", is("advantage Tsonga")));
    }

    @Test
    public void deuce() {
        for(int index = 1; index <= 3; index++) {
            Monfils.winBall();
        }
        for(int index = 1; index <= 3; index++) {
            Tsonga.winBall();
        }
        assertThat(game, hasProperty("score", is("deuce")));
        Monfils.winBall();
        assertThat(game, hasProperty("score", is(not("deuce"))));
        Tsonga.winBall();
        assertThat(game, hasProperty("score", is("deuce")));
    }

    @Test
    public void gameWon() {
        for(int index = 1; index <= 4; index++) {
            Monfils.winBall();
        }
        for(int index = 1; index <= 3; index++) {
            Tsonga.winBall();
        }
        assertThat(game, hasProperty("score", is(not("Monfils won"))));
        assertThat(game, hasProperty("score", is(not("Tsonga won"))));
        Monfils.winBall();
        assertThat(game, hasProperty("score", is("Monfils won")));
    }

}
