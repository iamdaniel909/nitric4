package ch.fhnw.broom.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.broom.data.domain.Accessory;
//import ch.fhnw.broom.data.domain.Broom;



    @Repository
//JpaRepository should be typed to the domain class and an ID type
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
    Accessory findByAccessoryName(String AccessoryName);
    
}
