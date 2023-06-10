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
    private Long id;

    @Column(name = "broom_colour")
    private String broomColour;

    @Column(name = "broom_name")
    private String broomName;

    @ManyToOne
    private Menu menu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    
}
