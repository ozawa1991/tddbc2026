package tddbc;

import java.util.Set;

public record Point(int value) {
    public static Point from(FallenSkittles fallen) {
        Set<Skittle> skittles = fallen.skittles();
        if (skittles.size() == 1) {
            return new Point(skittles.stream().findFirst().orElseThrow().number());
        }
        return new Point(skittles.size());
    }
}
