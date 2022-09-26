package ch.bbw.m151.kleinprojekt;

import ch.bbw.m151.kleinprojekt.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

    List<Person> findAllByCustomerName(String customerName);

    @Query ("SELECT e FROM Person e ")
    void deleteAllByName(String customerName);

}