package fit.biktjv.cinemas.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PlayKey implements Serializable {

    @Column(name = "c_id")
    Long cinemaId;

    @Column(name = "m_id")
    Long movieId;

    public PlayKey() {
    }

    public PlayKey(Long cinemaId, Long movieId) {
        this.cinemaId = cinemaId;
        this.movieId = movieId;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCinemaId(), getMovieId());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlayKey other = (PlayKey) obj;
        return Objects.equals(cinemaId, other.getCinemaId()) &&
                Objects.equals(movieId, other.getMovieId());
    }
}