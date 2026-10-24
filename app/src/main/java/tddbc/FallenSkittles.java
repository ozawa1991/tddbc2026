package tddbc;

import java.util.List;
import java.util.Set;

public final class FallenSkittles {
    private final Set<Skittle> numbers;

    public FallenSkittles(List<Skittle> numbers) {
        this.numbers = Set.copyOf(numbers);
        if (this.numbers.size() != numbers.size()) {
            throw new IllegalArgumentException("倒れたスキットルの番号が重複しています");
        }
    }

    public Set<Skittle> numbers() {
        return numbers;
    }
}
