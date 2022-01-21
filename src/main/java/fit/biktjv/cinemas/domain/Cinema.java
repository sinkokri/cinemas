package fit.biktjv.cinemas.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "Cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "c_id")
    private Long id;

    @Column(name = "c_name", nullable = false)
    private String name;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private Integer building;

    @OneToMany(mappedBy = "cinema")
    Set<Play> plays;

    public Cinema() {
    }

    public Cinema(Long id, String name, String street, String city, Integer building) {
        this(name, street, city, building);
        this.id = id;
    }

    public Cinema(String name, String street, String city, Integer building) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.building = building;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getC_name() {
        return name;
    }

    public void setC_name(String c_name) {
        this.name = c_name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public String toString() {
        return String.format("Cinema id %d - %s, located in %s, %s, %d", id, name, city, street, building);
}
}
