package tddbc;

public record Score(int value) {
    public static Score initial() {
        return new Score(0);
    }

    public Score add(Point point) {
        return new Score(this.value + point.value());
    }
}
