package tddbc;

import java.util.List;

public class Score {
    private final List<Skittle> skittles;

    public Score(List<Skittle> skittles) {
        this.skittles = skittles;
    }

    public int calc() {
        return skittles.getFirst().getNumber();
    }
}
