package com.backend.repositories;

import java.util.List;

import com.backend.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

  List<Program> findByAdmin(long admin);
}