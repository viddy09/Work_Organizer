package com.backend.repositories;

import java.util.List;

import com.backend.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRespository extends JpaRepository<Task, Long> {
  List<Task> findByProgram(long program);
}
