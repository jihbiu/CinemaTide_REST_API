package com.example.cinema_tide.Seat;

import com.example.cinema_tide.Screening.Screening;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="seats")
public class Seat {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name="seat_row", nullable = false)
    private Integer seatRow;

    @NotNull
    @Column(name="seat_column", nullable = false)
    private Integer seatColumn;

    @NotNull
    @OneToOne
    @JoinColumn(name="screening_id", nullable = false)
    private Screening screening_id;


    public Seat() {
    }

    public Seat(Integer id, Integer seatRow, Integer seatColumn, Screening screening_id) {
        this.id = id;
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        this.screening_id = screening_id;
    }

    public Seat(Integer seatRow, Integer seatColumn, Screening screening_id) {
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        this.screening_id = screening_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(Integer seatRow) {
        this.seatRow = seatRow;
    }

    public Integer getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(Integer seatColumn) {
        this.seatColumn = seatColumn;
    }

    public Screening getScreening_id() {
        return screening_id;
    }

    public void setScreening_id(Screening screening_id) {
        this.screening_id = screening_id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", seatRow=" + seatRow +
                ", seatColumn=" + seatColumn +
                ", screening_id=" + screening_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(id, seat.id) && Objects.equals(seatRow, seat.seatRow) && Objects.equals(seatColumn, seat.seatColumn) && Objects.equals(screening_id, seat.screening_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seatRow, seatColumn, screening_id);
    }
}

