package tddbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PointTest {
    @Test void スキットルが1本も倒れなかったとき_点数が0になること() {
        Point point = new Point(new FallenSkittles(List.of()));
        assertEquals(0, point.calc());
    }

    @Nested
    @DisplayName("倒れた本数が1本のとき、倒れたスキットルの番号が点数になること")
    class 倒れた本数が1本のとき {
        @Test void _1の番号のスキットルが倒れたとき_点数が1になること() {
            Point point = new Point(new FallenSkittles(List.of(
                new SkittleNumber(1)
            )));
            assertEquals(1, point.calc());
        }

        @Test void _12の番号のスキットルが倒れたとき_点数が12になること() {
            Point point = new Point(new FallenSkittles(List.of(
                new SkittleNumber(12)
            )));
            assertEquals(12, point.calc());
        }
    }

    @Nested
    @DisplayName("倒れた本数が2本以上のとき、倒れた本数が点数になること")
    class 倒れた本数が2本以上のとき {
        @Test void スキットルが2本倒れたとき_点数が2になること() {
            Point point = new Point(new FallenSkittles(List.of(
                new SkittleNumber(1),
                new SkittleNumber(2)
            )));
            assertEquals(2, point.calc());
        }

        @Test void スキットルが3本倒れたとき_点数が3になること() {
            Point point = new Point(new FallenSkittles(List.of(
                new SkittleNumber(1),
                new SkittleNumber(2),
                new SkittleNumber(3)
            )));
            assertEquals(3, point.calc());
        }
    }
}
