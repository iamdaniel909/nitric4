package ch.fhnw.broom.data.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Menu {

    @Id
    @JsonIgnore
    private Long id;

    @OneToMany(mappedBy = "menu")
    private List<Broom> broomList;

    private String currentOffer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Broom> getBroomList() {
        return broomList;
    }

    public void setBroomList(List<Broom> broomList) {
        this.broomList = broomList;
    }

    public String getCurrentOffer() {
        return currentOffer;
    }

    public void setCurrentOffer(String currentOffer) {
        this.currentOffer = currentOffer;
    }

    
    
}
