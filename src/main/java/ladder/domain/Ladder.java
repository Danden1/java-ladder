package ladder.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private final List<Line> lines;

    public Ladder(int userCount, Height height) {
        this.lines = generateLines(userCount, height);
    }

    private List<Line> generateLines(int userCount, Height height) {
        List<Line> lineList =  IntStream.rangeClosed(Height.MIN_HEIGHT, height.getHeight())
                                    .mapToObj(count -> new Line(userCount))
                                    .collect(Collectors.toList());
        return Collections.unmodifiableList(lineList);
    }

    public int downLadder(final int userPosition) {
        int currentPosition = userPosition;
        for(Line line : lines) {
            currentPosition = line.move(currentPosition);
        }
        return currentPosition;
    }

    public List<Line> getLadder(){
        return lines;
    }
}