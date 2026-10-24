package tddbc;

public record Score(int value) {
    public Score add(Point point) {
        return new Score(this.value + point.value());
    }
}
