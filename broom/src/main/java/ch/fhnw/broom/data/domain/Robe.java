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

    @Column(name = "robe_name")
    private String robeName;

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

    public void setRobeColour(String robeColour) {
        this.robeColour = robeColour;
    }

    public String getRobeName() {
        return robeName;
    }

    public void setRobeName(String robeName) {
        this.robeName = robeName;
    } 

    public Integer getRobePrize() {
        return robePrice;
    }

    public void setRobePrice(Integer robePrice) {
        this.robePrice = robePrice;
    }
}
