package tddbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PointTest {
    @Test void スキットルが1本も倒れなかったとき_点数が0になること() {
        Point point = Point.from(new FallenSkittles(List.of()));
        assertEquals(0, point.value());
    }

    @Nested
    @DisplayName("倒れた本数が1本のとき、倒れたスキットルの番号が点数になること")
    class 倒れた本数が1本のとき {
        @Test void _1の番号のスキットルが倒れたとき_点数が1になること() {
            Point point = Point.from(new FallenSkittles(List.of(
                new Skittle(1)
            )));
            assertEquals(1, point.value());
        }

        @Test void _12の番号のスキットルが倒れたとき_点数が12になること() {
            Point point = Point.from(new FallenSkittles(List.of(
                new Skittle(12)
            )));
            assertEquals(12, point.value());
        }
    }

    @Nested
    @DisplayName("倒れた本数が2本以上のとき、倒れた本数が点数になること")
    class 倒れた本数が2本以上のとき {
        @Test void スキットルが2本倒れたとき_点数が2になること() {
            Point point = Point.from(new FallenSkittles(List.of(
                new Skittle(3),
                new Skittle(5)
            )));
            assertEquals(2, point.value());
        }

        @Test void スキットルが3本倒れたとき_点数が3になること() {
            Point point = Point.from(new FallenSkittles(List.of(
                new Skittle(6),
                new Skittle(3),
                new Skittle(11)
            )));
            assertEquals(3, point.value());
        }
    }
}
