package SumOfIntervals;

import java.util.ArrayList;

public class LengthsAdder {
    public int addLengths(ArrayList<Interval> intervals) {
        int totalLength = 0;
        for (Interval interval : intervals) {
            totalLength += interval.length();
        }
        return totalLength;
    }
}
