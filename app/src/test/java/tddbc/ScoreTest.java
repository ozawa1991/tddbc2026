package tddbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
    @Test void スキットルが1本も倒れなかったとき_スコアが0になること() {
        List<Skittle> skittles = new ArrayList<>();
        Score score = new Score(skittles);
        assertEquals(0, score.calc());
    }

    @Nested
    @DisplayName("倒れた本数が1本のとき、倒れたスキットルの番号がスコアになること")
    class 倒れた本数が1本のとき {
        @Test void _1の番号のスキットルが倒れたとき_スコアが1になること() {
            List<Skittle> skittles = new ArrayList<>();
            skittles.add(new Skittle(new SkittleNumber(1)));
            Score score = new Score(skittles);
            assertEquals(1, score.calc());
        }

        @Test void _12の番号のスキットルが倒れたとき_スコアが12になること() {
            List<Skittle> skittles = new ArrayList<>();
            skittles.add(new Skittle(new SkittleNumber(12)));
            Score score = new Score(skittles);
            assertEquals(12, score.calc());
        }
    }

    @Nested
    @DisplayName("倒れた本数が2本以上のとき、倒れた本数がスコアになること")
    class 倒れた本数が2本以上のとき {
        @Test void スキットルが2本倒れたとき_スコアが2になること() {
            List<Skittle> skittles = new ArrayList<>();
            skittles.add(new Skittle(new SkittleNumber(1)));
            skittles.add(new Skittle(new SkittleNumber(2)));
            Score score = new Score(skittles);
            assertEquals(2, score.calc());
        }

        @Test void スキットルが3本倒れたとき_スコアが3になること() {
            List<Skittle> skittles = new ArrayList<>();
            skittles.add(new Skittle(new SkittleNumber(1)));
            skittles.add(new Skittle(new SkittleNumber(2)));
            skittles.add(new Skittle(new SkittleNumber(3)));
            Score score = new Score(skittles);
            assertEquals(3, score.calc());
        }
    }
}
