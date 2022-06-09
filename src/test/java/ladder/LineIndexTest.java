package ladder;

import static ladder.PlayerTest.PLAYER_NAME_LIST_1;
import static ladder.PlayersTest.PLAYERS_1;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LineIndexTest {

  public static final LineIndex FIRST_LINE_INDEX = LineIndex.init(
      PLAYERS_1, PLAYER_NAME_LIST_1.get(0)
  );
  public static final LineIndex SECOND_LINE_INDEX = LineIndex.init(
      PLAYERS_1, PLAYER_NAME_LIST_1.get(1)
  );
  public static final LineIndex THIRD_LINE_INDEX = LineIndex.init(
      PLAYERS_1, PLAYER_NAME_LIST_1.get(2)
  );

  @ParameterizedTest
  @ValueSource(ints = {0, 1, 2, 3, 4})
  void LineIndex_생성_성공(int index) {
    assertDoesNotThrow(() -> new LineIndex(5, index));
  }

  @Test
  void LinIndex_생성_실패() {
    assertThrows(IllegalArgumentException.class, () -> new LineIndex(5, 5));
    assertThrows(IllegalArgumentException.class, () -> new LineIndex(5, -1));
  }

  @Test
  void moveRight() {
    LineIndex lineIndex = new LineIndex(3, 0);
    LineIndex expected = new LineIndex(3, 1);

    assertThat(lineIndex.moveRight()).isEqualTo(expected);
  }

  @Test
  void moveLeft_성공() {
    LineIndex lineIndex = new LineIndex(3, 1);
    LineIndex expected = new LineIndex(3, 0);

    assertThat(lineIndex.moveLeft()).isEqualTo(expected);
  }

  @Test
  void value_성공() {
    Player firstPlayer = PLAYER_NAME_LIST_1.get(0);

    LineIndex lineIndex = LineIndex.init(PLAYERS_1, firstPlayer);

    assertThat(lineIndex.value()).isEqualTo(0);
  }

  @Test
  void equals_성공() {
    assertThat(new LineIndex(3, 1)).isEqualTo(new LineIndex(3, 1));
  }

  @Test
  void init_성공() {
    Player firstPlayer = PLAYER_NAME_LIST_1.get(0);
    LineIndex expected = new LineIndex(PLAYER_NAME_LIST_1.size(), 0);

    LineIndex lineIndex = LineIndex.init(PLAYERS_1, firstPlayer);

    assertThat(lineIndex).isEqualTo(expected);
  }
}