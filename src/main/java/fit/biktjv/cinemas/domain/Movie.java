package fit.biktjv.cinemas.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "m_id")
    Long id;

    @Column(name = "m_name", nullable = false)
    String name;

    @Column(nullable = false)
    Integer year;

    @OneToMany(mappedBy = "movie")
    Set<Play> plays;

    public Movie() {
    }

    public Movie(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public Movie(Long id, String m_name, Integer year) {
        this(m_name, year);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getM_name() {
        return name;
    }

    public void setM_name(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String toString() {
        return String.format("%s (%d)", name, year);
    }
}
