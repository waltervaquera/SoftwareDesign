package SumOfIntervals;

public class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Interval(int[] arrayInterval) {
        this.start = arrayInterval[0];
        this.end = arrayInterval[1];
    }

    public int length() {
        return end - start;
    }
}
