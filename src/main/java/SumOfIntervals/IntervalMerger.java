package SumOfIntervals;

public class IntervalMerger {
    public Interval merge(Interval a, Interval b) {
        return new Interval(Math.min(a.start, b.start), Math.max(a.end, b.end));
    }
}
