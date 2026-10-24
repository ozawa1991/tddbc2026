package tddbc;

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

    @Test void _1の番号のスキットルが1本だけ倒れたとき_スコアが1になること() {
        List<Skittle> skittles = new ArrayList<>();
        skittles.add(new Skittle(1));
        Score score = new Score(skittles);
        assertEquals(1, score.calc());
    }

    @Test void _2の番号のスキットルが1本だけ倒れたとき_スコアが2になること() {
        List<Skittle> skittles = new ArrayList<>();
        skittles.add(new Skittle(2));
        Score score = new Score(skittles);
        assertEquals(2, score.calc());
    }

    @Test void スキットルが2本倒れたとき_スコアが2になること() {
        List<Skittle> skittles = new ArrayList<>();
        skittles.add(new Skittle(1));
        skittles.add(new Skittle(2));
        Score score = new Score(skittles);
        assertEquals(2, score.calc());
    }

    @Test void スキットルが3本倒れたとき_スコアが3になること() {
        List<Skittle> skittles = new ArrayList<>();
        skittles.add(new Skittle(1));
        skittles.add(new Skittle(2));
        skittles.add(new Skittle(3));
        Score score = new Score(skittles);
        assertEquals(3, score.calc());
    }
}
