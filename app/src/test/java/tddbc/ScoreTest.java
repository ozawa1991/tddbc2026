package tddbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ScoreTest {
    @Test void スキットルが1本も倒れなかったとき_スコアが0になること() {
        Score score = new Score(new FallenSkittles(List.of()));
        assertEquals(0, score.calc());
    }

    @Nested
    @DisplayName("倒れた本数が1本のとき、倒れたスキットルの番号がスコアになること")
    class 倒れた本数が1本のとき {
        @Test void _1の番号のスキットルが倒れたとき_スコアが1になること() {
            Score score = new Score(new FallenSkittles(List.of(
                new SkittleNumber(1)
            )));
            assertEquals(1, score.calc());
        }

        @Test void _12の番号のスキットルが倒れたとき_スコアが12になること() {
            Score score = new Score(new FallenSkittles(List.of(
                new SkittleNumber(12)
            )));
            assertEquals(12, score.calc());
        }
    }

    @Nested
    @DisplayName("倒れた本数が2本以上のとき、倒れた本数がスコアになること")
    class 倒れた本数が2本以上のとき {
        @Test void スキットルが2本倒れたとき_スコアが2になること() {
            Score score = new Score(new FallenSkittles(List.of(
                new SkittleNumber(1),
                new SkittleNumber(2)
            )));
            assertEquals(2, score.calc());
        }

        @Test void スキットルが3本倒れたとき_スコアが3になること() {
            Score score = new Score(new FallenSkittles(List.of(
                new SkittleNumber(1),
                new SkittleNumber(2),
                new SkittleNumber(3)
            )));
            assertEquals(3, score.calc());
        }
    }
}
