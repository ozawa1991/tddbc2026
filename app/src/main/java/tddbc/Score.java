package tddbc;

import java.util.List;

public class Score {
    private final List<Skittle> skittles;

    public Score(List<Skittle> skittles) {
        this.skittles = skittles;
    }

    public int calc() {
        if(skittles.size() == 1) {
            return skittles.getFirst().getNumber();
        }
        return skittles.size();
    }
}
