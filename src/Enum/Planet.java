package Enum;

public enum Planet {
    MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7), NEPTUNE(8), PLUTO(9);

    private final int number;

    Planet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
