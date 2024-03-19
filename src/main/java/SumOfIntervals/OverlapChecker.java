package SumOfIntervals;

public class OverlapChecker {
    public boolean check(Interval a, Interval b) {
        return a.start >= b.start && a.start <= b.end
                || a.end >= b.start && a.end <= b.end
                || b.start >= a.start && b.start <= a.end
                || b.end >= a.start && b.end <= a.end;
    }
}
