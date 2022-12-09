package com.example.cinema_tide.reservation;

import com.example.cinema_tide.Screening.Screening;
import com.example.cinema_tide.Seat.Seat;
import com.example.cinema_tide.user.User;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "reservations")
public class Reservation {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "screening_id", nullable = false)
    private Screening screening_id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat_id;

    public Reservation() {}

    public Reservation(Screening screening_id, User user_id, Seat seat_id) {
        this.screening_id = screening_id;
        this.user_id = user_id;
        this.seat_id = seat_id;
    }

    public Reservation(Integer id, Screening screening_id, User user_id, Seat seat_id) {
        this.id = id;
        this.screening_id = screening_id;
        this.user_id = user_id;
        this.seat_id = seat_id;
    }

    public Integer getId() {
        return id;
    }

    public Screening getScreening_id() {
        return screening_id;
    }

    public void setScreening_id(Screening screening_id) {
        this.screening_id = screening_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Seat getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Seat seat_id) {
        this.seat_id = seat_id;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", screening_id=" + screening_id +
                ", user_id=" + user_id +
                ", seat_id=" + seat_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id)
                && Objects.equals(screening_id, that.screening_id)
                && Objects.equals(user_id, that.user_id)
                && Objects.equals(seat_id, that.seat_id);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, screening_id, user_id, seat_id);
    }
}
