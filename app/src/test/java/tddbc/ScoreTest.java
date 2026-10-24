package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ScoreTest {
    @Test void _1回も投てきされていないときは0点であること() {
        Score score = Score.initial();
        assertEquals(0, score.value());
    }

    @Test void _1回投てきを行ったとき_その点数が現在の得点になること() {
        Score newScore = Score.initial().add(new Point(5));
        assertEquals(5, newScore.value());
    }

    @Test void _2回投てきを行ったとき_2回の合計点数が現在の得点になること() {
        Score newScore = Score.initial().add(new Point(5)).add(new Point(7));
        assertEquals(12, newScore.value());
    }

    @Test void _0点の投てきを含んでいても_合計点数が算出できること() {
        Score newScore = Score.initial().add(new Point(5)).add(new Point(0));
        assertEquals(5, newScore.value());
    }
}
