package tddbc;

import java.util.List;
import java.util.Set;

public final class FallenSkittles {
    private final Set<Skittle> skittles;

    public Set<Skittle> skittles() {
        return skittles;
    }

    public FallenSkittles(List<Skittle> skittles) {
        this.skittles = Set.copyOf(skittles);
        if (this.skittles.size() != skittles.size()) {
            throw new IllegalArgumentException("倒れたスキットルの番号が重複しています");
        }
    }
}
