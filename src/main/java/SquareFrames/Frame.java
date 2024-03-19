package SquareFrames;

public class Frame {
    private final int x;
    private final int y;
    private final int sideLength;

    public Frame(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + sideLength;
    }
}
