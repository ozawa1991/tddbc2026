package tddbc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SkittleTest {
    @Test void _1の番号のスキットルは有効であること() {
        assertDoesNotThrow(() -> new Skittle(1));
    }

    @Test void _12の番号のスキットルは有効であること() {
        assertDoesNotThrow(() -> new Skittle(12));
    }

    @Test void _0の番号のスキットルは無効であること() {
        assertThrows(IllegalArgumentException.class, () -> new Skittle(0));
    }

    @Test void _13の番号のスキットルは無効であること() {
        assertThrows(IllegalArgumentException.class, () -> new Skittle(13));
    }
}
