package ch.fhnw.broom.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.fhnw.pizza.data.domain.Broom;

@Repository
//JpaRepository should be typed to the domain class and an ID type
public interface BroomRepository extends JpaRepository<Broom, Long> {
    Pizza findByBroomName(String BroomName);
    List<Broom> findAllByBroomColoursContainsIgnoreCase(String colour);
}
