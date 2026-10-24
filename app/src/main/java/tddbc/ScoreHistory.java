package tddbc;

import java.util.ArrayList;
import java.util.List;

public record ScoreHistory(List<Score> scores) {
    public static ScoreHistory initial() {
        return new ScoreHistory(List.of());
    }

    public ScoreHistory add(Point point) {
        List<Score> next = new ArrayList<>(scores);
        next.add(current().add(point));
        return new ScoreHistory(List.copyOf(next));
    }

    public Score current() {
        return scores.isEmpty() ? Score.initial() : scores.getLast();
    }
}
