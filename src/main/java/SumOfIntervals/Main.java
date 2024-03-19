package SumOfIntervals;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static IntervalParser intervalParser = new IntervalParser();
    static OverlapChecker overlapChecker = new OverlapChecker();
    static IntervalMerger intervalMerger = new IntervalMerger();
    static LengthsAdder lengthsAdder = new LengthsAdder();

    public static int sumIntervals(int[][] intervalsArray) {
        ArrayList<Interval> intervals = intervalParser.parse(intervalsArray);
        intervals.sort(Comparator.comparingInt(a -> a.start));

        ArrayList<Interval> mergedIntervals = new ArrayList<>();

        for (Interval interval : intervals) {
            boolean merged = false;
            for (int i = 0; i < mergedIntervals.size(); i++) {
                Interval mergedInterval = mergedIntervals.get(i);
                if (overlapChecker.check(mergedInterval, interval)) {
                    Interval newInterval = intervalMerger.merge(mergedInterval, interval);
                    mergedIntervals.set(i, newInterval);
                    merged = true;
                    break;
                }
            }
            if (!merged) {
                mergedIntervals.add(interval);
            }
        }

        return lengthsAdder.addLengths(mergedIntervals);
    }
}
