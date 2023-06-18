package ch.fhnw.broom.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "broom")
public class Broom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "broom_colour")
    private String broomColour;

    @Column(name = "broom_name")
    private String broomName;

    @Column(name = "broom_price")
    private Double broomPrice;


    @ManyToOne
    private Menu menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBroomColour() {
        return broomColour;
    }

    public void setBroomColour(String broomColour) {
        this.broomColour = broomColour;
    }

    public String getBroomName() {
        return broomName;
    }

    public void setBroomName(String broomName) {
        this.broomName = broomName;
    } 

    public Double getBroomPrice() {
        return broomPrice;
    }

    public void setBroomPrice(Double broomPrice) {
        this.broomPrice = broomPrice;
    }
    
}
