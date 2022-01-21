package fit.biktjv.cinemas.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "m_id")
    private Long id;

    @Column(nullable = false)
    private String m_name;

    @Column(nullable = false)
    private Integer year;

    @OneToMany(mappedBy = "movie")
    Set<Play> plays;

    public Movie() {
    }

    public Movie(String m_name, Integer year) {
        this.m_name = m_name;
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
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String toString() {
        return String.format("Movie %s with id %d, filmed in year %d", m_name, id, year);
    }
}
