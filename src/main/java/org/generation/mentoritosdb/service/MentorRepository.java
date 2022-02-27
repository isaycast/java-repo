package org.generation.mentoritosdb.service;

import org.generation.mentoritosdb.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
    @Query(value = "SELECT * FROM mentor ", nativeQuery = true)
    List<Mentor> findAllMentors();


}
