package ch.fhnw.broom.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "robe")
public class Robe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "robe_colour")
    private String robeColour;

    @Column(name = "robe_size")
    private String robeSize;

    @Column(name = "robe_price")
    private Integer robePrice;


    @ManyToOne
    private Menu menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRobeColour() {
        return robeColour;
    }

    public void setBroomColour(String robeColour) {
        this.robeColour = robeColour;
    }

    public String getRobeSize() {
        return robeSize;
    }

    public void setRobeSize(String robeSize) {
        this.robeSize = robeSize;
    } 

    public Integer getRobePrize() {
        return robePrice;
    }

    public void setBroomPrice(Integer robePrice) {
        this.robePrice = robePrice;
    }
}
