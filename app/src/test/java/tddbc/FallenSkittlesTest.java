package tddbc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class FallenSkittlesTest {
    @Test void 全12本のスキットルが倒れても有効であること() {
        Set<SkittleNumber> numbers = IntStream.rangeClosed(1, 12).mapToObj(SkittleNumber::new).collect(Collectors.toSet());
        FallenSkittles fallen = assertDoesNotThrow(() -> new FallenSkittles(numbers));
        assertEquals(12, fallen.numbers().size());
    }
}
