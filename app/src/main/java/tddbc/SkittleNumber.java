package tddbc;

public record SkittleNumber(int value) {
    public SkittleNumber {
        if (value < 1 || value > 12) {
            throw new IllegalArgumentException("スキットルの番号は1〜12: " + value);
        }
    }
}

