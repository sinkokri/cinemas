package fit.biktjv.cinemas.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "Cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "c_id")
    Long id;

    @Column(name = "c_name", nullable = false)
    String name;

    @Column(nullable = false)
    String street;

    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    Integer building;

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

    public String getName() {
        return name;
    }

    public void setName(String c_name) {
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
        return String.format("Cinema: %s, located in %s, %s, %d", name, city, street, building);
}
}
