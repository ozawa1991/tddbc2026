package tddbc;

import java.util.List;
import java.util.Set;

public final class FallenSkittles {
    private final Set<SkittleNumber> numbers;

    public FallenSkittles(List<SkittleNumber> numbers) {
        this.numbers = Set.copyOf(numbers);
        if (this.numbers.size() != numbers.size()) {
            throw new IllegalArgumentException("倒れたスキットルの番号が重複しています");
        }
    }

    public Set<SkittleNumber> numbers() {
        return numbers;
    }
}
