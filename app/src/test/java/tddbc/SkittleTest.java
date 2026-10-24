package tddbc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class SkittleTest {
    @Nested
    @DisplayName("スキットルの番号が1〜12のとき、有効であること")
    class 有効 {
        @Test void _1の番号のスキットルは有効であること() {
            assertDoesNotThrow(() -> new Skittle(1));
        }

        @Test void _12の番号のスキットルは有効であること() {
            assertDoesNotThrow(() -> new Skittle(12));
        }
    }

    @Nested
    @DisplayName("スキットルの番号が1〜12以外のとき、無効であること")
    class 無効 {
        @Test void _0の番号のスキットルは無効であること() {
            assertThrows(IllegalArgumentException.class, () -> new Skittle(0));
        }

        @Test void _13の番号のスキットルは無効であること() {
            assertThrows(IllegalArgumentException.class, () -> new Skittle(13));
        }
    }
}
