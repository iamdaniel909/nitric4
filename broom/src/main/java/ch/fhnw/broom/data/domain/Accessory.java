package ch.fhnw.broom.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "accessory")
public class Accessory{

@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "accessory_name")
    private String accessoryName;

    @Column(name = "accessory_price")
    private Integer accessoryPrice;

    @ManyToOne
    private Menu menu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public Integer getAccessoryPrice() {
        return accessoryPrice;
    }

    public void setAccessoryPrice(Integer accessoryPrice) {
        this.accessoryPrice = accessoryPrice;
    }

    
}

