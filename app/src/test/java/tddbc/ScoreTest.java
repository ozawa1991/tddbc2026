package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ScoreTest {
    @Test void _1回も投てきされていないときは0点であること() {
        Score score = new Score(0);
        assertEquals(0, score.value());
    }

    @Test void _1回投てきを行ったとき_その点数が現在の得点になること() {
        Score score = new Score(0);
        Score newScore = score.add(new Point(5));
        assertEquals(5, newScore.value());
    }
}
