package SquareFrames;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[][] screen = {};
        ScreenReader screenReader = new ScreenReader(screen);

        showFrames(screenReader.readFrames());
    }

    private static void showFrames(List<Frame> frames) {
        System.out.println(frames.size());

        for (Frame frame : frames) {
            System.out.println(frame);
        }
    }
}
