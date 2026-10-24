package tddbc;

import java.util.Set;

public class Score {
    private final FallenSkittles fallen;

    public Score(FallenSkittles fallen) {
        this.fallen = fallen;
    }

    public int calc() {
        Set<SkittleNumber> numbers = fallen.numbers();
        if (numbers.size() == 1) {
            return numbers.stream().findFirst().orElseThrow().value();
        }
        return numbers.size();
    }
}
