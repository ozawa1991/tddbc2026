package tddbc;

import java.util.Set;

public final class FallenSkittles {
    private final Set<SkittleNumber> numbers;

    public FallenSkittles(Set<SkittleNumber> numbers) {
        this.numbers = Set.copyOf(numbers);
    }

    public Set<SkittleNumber> numbers() {
        return numbers;
    }
}
