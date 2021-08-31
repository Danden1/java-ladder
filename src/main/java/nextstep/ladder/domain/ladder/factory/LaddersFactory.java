package nextstep.ladder.domain.ladder.factory;

import nextstep.ladder.domain.ladder.Ladder;
import nextstep.ladder.domain.ladder.Ladders;
import nextstep.ladder.domain.ladder.line.strategy.HorizontalLinesGenerateStrategy;

import java.util.ArrayList;
import java.util.List;

public class LaddersFactory {

    private LaddersFactory() {
    }

    public static Ladders generateWith(int height, int count, HorizontalLinesGenerateStrategy strategy) {
        List<Ladder> ladders = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Ladder ladder = LadderFactory.generateWith(height, strategy);
            ladders.add(ladder);
        }
        return new Ladders(ladders);
    }
}