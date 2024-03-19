package SumOfIntervals;

import java.util.ArrayList;

public class IntervalParser {
    public ArrayList<Interval> parse(int[][] intervalsArray) {
        ArrayList<Interval> intervals = new ArrayList<>();
        for (int[] interval : intervalsArray) {
            intervals.add(new Interval(interval));
        }
        return intervals;
    }
}
