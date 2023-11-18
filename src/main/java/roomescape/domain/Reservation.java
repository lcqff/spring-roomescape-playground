package roomescape.domain;

import java.util.concurrent.atomic.AtomicLong;

public record Reservation(AtomicLong id, String name, String date, String time) {

    public static Reservation toEntity(Reservation reservation, long id) {
        return new Reservation(new AtomicLong(id), reservation.name, reservation.date, reservation.time);
    }
}
