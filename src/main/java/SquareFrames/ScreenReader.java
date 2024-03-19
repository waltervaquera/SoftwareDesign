package SquareFrames;

import java.util.ArrayList;
import java.util.List;

public class ScreenReader {
    private final char[][] screen;

    public ScreenReader(char[][] screen) {
        this.screen = screen;
    }

    public List<Frame> readFrames() {
        List<Frame> frames = new ArrayList<>();

        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 50; x++) {
                if (screen[y][x] == '┌') {
                    int frameSide = calculateFrameSide(x, y);
                    frames.add(new Frame(x, y, frameSide));
                }
            }
        }

        return frames;
    }

    private int calculateFrameSide(int x1, int y) {
        int frameSide = 0;

        for (int x = x1; x < 50; x++) {
            if (screen[y][x] == '.') {
                break;
            }
            frameSide++;
        }

        return frameSide;
    }
}
