package ch.fhnw.broom.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.broom.data.domain.Robe;

@Repository
//JpaRepository should be typed to the domain class and an ID type
public interface RobeRepository extends JpaRepository<Robe, Long> {
    Robe findByRobeName(String RobeName);
    //List<Broom> findAllByBroomColoursContainsIgnoreCase(String colour);
}
