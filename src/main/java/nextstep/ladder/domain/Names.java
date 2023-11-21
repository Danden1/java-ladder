package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Names {

    private static final String NAMES_DELIMITER = ",";

    private final List<Name> values = new ArrayList<>();

    public Names(String names) {
        Arrays.stream(names.split(NAMES_DELIMITER))
                .forEach(name -> this.values.add(new Name(name)));
    }

    public List<Name> nameList() {
        return Collections.unmodifiableList(values);
    }

    public int size() {
        return values.size();
    }
}