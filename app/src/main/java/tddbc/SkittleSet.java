package tddbc;

import java.util.List;
import java.util.stream.IntStream;

public record SkittleSet(List<Skittle> skittles) {
    public SkittleSet() {
        this(IntStream.rangeClosed(1, 12)
                .mapToObj(n -> new Skittle(new SkittleNumber(n)))
                .toList());
    }
}
