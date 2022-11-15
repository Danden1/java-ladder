package ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderPositionTest {


    @Test
    void shouldIncreasePosition() {
        LadderPosition position = new LadderPosition(new Position(0));

        position.next();

        assertThat(position.getHorizontalPosition()).isEqualTo(new Position(1));
    }

    @Test
    void shouldDecreasePosition() {
        LadderPosition position = new LadderPosition(new Position(1));

        position.previous();

        assertThat(position.getHorizontalPosition()).isEqualTo(new Position(0));
    }

    @Test
    void shouldValidateArrived() {
        LadderPosition position = new LadderPosition(new Position(1));

        position.down();

        assertThat(position.isArrived(new LadderLength(1))).isTrue();
        assertThat(position.isArrived(new LadderLength(2))).isFalse();
    }

}
