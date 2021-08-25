package ladder.domain.player;

import ladder.utils.StringUtil;

import java.util.Objects;

public class Name {

    private static final int LIMIT_LENGTH = 5;
    private static final int ZERO = 0;

    private final String value;

    public Name(String value) {
        validateName(value);
        this.value = value.trim();
    }

    private void validateName(String name) {
        validateBlank(name);
        validateLength(name);
    }

    private void validateLength(String name) {
        if (name.trim().length() > LIMIT_LENGTH) {
            throw new PlayerNameException(name.trim().length());
        }
    }

    private void validateBlank(String name) {
        if (StringUtil.isBlank(name)) {
            throw new PlayerNameException(ZERO);
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}