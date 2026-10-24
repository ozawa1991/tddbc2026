package tddbc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
    @Test void _1の番号のスキットルが倒れたとき_スコアが1になること() {
        List<Skittle> skittles = new ArrayList<>();
        skittles.add(new Skittle(1));
        Score score = new Score(skittles);
        assertEquals(1, score.calc());
    }
    @Test void _2の番号のスキットルが倒れたとき_スコアが2になること() {
        List<Skittle> skittles = new ArrayList<>();
        skittles.add(new Skittle(2));
        Score score = new Score(skittles);
        assertEquals(2, score.calc());
    }
}
