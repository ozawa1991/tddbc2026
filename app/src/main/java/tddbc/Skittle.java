package tddbc;

public record Skittle(int number) {
    public Skittle {
        if (number < 1 || number > 12) {
            throw new IllegalArgumentException("スキットルの番号は1〜12: " + number);
        }
    }
}

