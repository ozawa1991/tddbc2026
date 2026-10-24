package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ScoreHistoryTest {
    @Test void _1回も投てきされていないときは履歴が空で_現在の得点は0点であること() {
        ScoreHistory history = ScoreHistory.initial();
        assertEquals(List.of(), history.scores());
        assertEquals(Score.initial(), history.current());
    }

    @Test void _1回投てきを行ったとき_その時点の得点が履歴に記録されること() {
        ScoreHistory history = ScoreHistory.initial()
            .add(new Point(5));
        assertEquals(List.of(new Score(5)), history.scores());
    }

    @Test void _各投てき終了時の得点が履歴に記録されること() {
        ScoreHistory history = ScoreHistory.initial()
            .add(new Point(5))
            .add(new Point(11))
            .add(new Point(0))
            .add(new Point(3));
        assertEquals(List.of(new Score(5), new Score(16), new Score(16), new Score(19)), history.scores());
    }

    @Test void _現在の得点は最後の投てき終了時の得点であること() {
        ScoreHistory history = ScoreHistory.initial()
            .add(new Point(5))
            .add(new Point(11));
        assertEquals(new Score(16), history.current());
    }
}
