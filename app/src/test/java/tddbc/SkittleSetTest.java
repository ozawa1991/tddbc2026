package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SkittleSetTest {
    @Test void スキットルは12本あること() {
        assertEquals(12, new SkittleSet().skittles().size());
    }

    @Test void スキットルの番号の重複要素は0であること() {
        List<Skittle> skittles = new SkittleSet().skittles();
        long distinct = skittles.stream().map(Skittle::getNumber).distinct().count();
        assertEquals(skittles.size(), distinct);
    }
}

