package tddbc;

import java.util.Set;

public record Point(int value) {
    public static Point from(FallenSkittles fallen) {
        Set<SkittleNumber> numbers = fallen.numbers();
        if (numbers.size() == 1) {
            return new Point(numbers.stream().findFirst().orElseThrow().value());
        }
        return new Point(numbers.size());
    }
}
