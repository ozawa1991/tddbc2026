package tddbc;

public class Skittle {
    private final SkittleNumber number;

    public Skittle(SkittleNumber number) {
        this.number = number;
    }

    public int getNumber() {
        return number.value();
    }
}
