package ladder.domain;

import ladder.exception.InvalidParticipantNumberException;

import java.util.List;

public class Participants {

    public static final int MINIMUM_PARTICIPANTS_NUMBER = 2;
    private final List<Participant> participants;

    public Participants(List<Participant> participants) {
        validParticipants(participants);
        this.participants = participants;
    }

    private void validParticipants(List<Participant> participants) {
        if (participants.size() < MINIMUM_PARTICIPANTS_NUMBER) {
            throw new InvalidParticipantNumberException();
        }
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public Integer size() {
        return participants.size();
    }
}
