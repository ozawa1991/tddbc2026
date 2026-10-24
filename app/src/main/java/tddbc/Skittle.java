package tddbc;

public class Skittle {
    private final int number;

    public Skittle(int number) {
        if (number < 1 || number > 12) {
            throw new IllegalArgumentException("スキットルの番号は1〜12: " + number);
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
