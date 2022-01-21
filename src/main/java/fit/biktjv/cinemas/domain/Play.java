package fit.biktjv.cinemas.domain;

import javax.persistence.*;

@Entity
@Table(name = "Play")
public class Play {

    @EmbeddedId
    PlayKey id;

    @ManyToOne
    @MapsId("cinemaId")
    @JoinColumn(name = "c_id")
    Cinema cinema;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "m_id")
    Movie movie;

    @Column
    private Integer month;
    @Column
    private Integer year;
    @Column
    private Integer day;

    public Play() {
    }

    public Play(Cinema cinema, Movie movie, Integer month, Integer year, Integer day) {
        this.cinema = cinema;
        this.movie = movie;
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public Play(PlayKey id, Cinema cinema, Movie movie, Integer month, Integer year, Integer day) {
        this(cinema, movie, month, year, day);
        this.id = id;
    }

    public PlayKey getId() {
        return id;
    }

    public void setId(PlayKey id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
