package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class FallenSkittlesTest {
    @Test void 同じ番号のスキットルが重複して存在しないこと() {
        List<Skittle> numbers = List.of(new Skittle(1), new Skittle(1));
        assertThrows(IllegalArgumentException.class, () -> new FallenSkittles(numbers));
    }

    @Test void _2_4_6番のスキットル3本が倒れたことが表現されること() {
        List<Skittle> numbers = List.of(new Skittle(2), new Skittle(4), new Skittle(6));
        FallenSkittles fallen = new FallenSkittles(numbers);
        assertEquals(Set.of(new Skittle(4), new Skittle(2), new Skittle(6)), fallen.skittles());
    }
}
