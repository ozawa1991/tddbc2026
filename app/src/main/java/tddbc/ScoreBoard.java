package tddbc;

import java.util.ArrayList;
import java.util.List;

public record ScoreBoard(List<Score> scores) {
    public static ScoreBoard initial() {
        return new ScoreBoard(List.of());
    }

    public ScoreBoard record(Point point) {
        List<Score> next = new ArrayList<>(scores);
        next.add(current().add(point));
        return new ScoreBoard(List.copyOf(next));
    }

    public Score current() {
        return scores.isEmpty() ? Score.initial() : scores.getLast();
    }
}
