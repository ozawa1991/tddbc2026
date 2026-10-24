package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ScoreBoardTest {
    @Test void _1回も投てきされていないときは履歴が空で_現在の得点は0点であること() {
        ScoreBoard board = ScoreBoard.initial();
        assertEquals(List.of(), board.scores());
        assertEquals(Score.initial(), board.current());
    }

    @Test void _1回投てきを行ったとき_その時点の得点が履歴に記録されること() {
        ScoreBoard board = ScoreBoard.initial()
            .record(new Point(5));
        assertEquals(List.of(new Score(5)), board.scores());
    }

    @Test void _各投てき終了時の得点が履歴に記録されること() {
        ScoreBoard board = ScoreBoard.initial()
            .record(new Point(5))
            .record(new Point(11))
            .record(new Point(0))
            .record(new Point(3));
        assertEquals(List.of(new Score(5), new Score(16), new Score(16), new Score(19)), board.scores());
    }

    @Test void _現在の得点は最後の投てき終了時の得点であること() {
        ScoreBoard board = ScoreBoard.initial()
            .record(new Point(5))
            .record(new Point(11));
        assertEquals(new Score(16), board.current());
    }
}
