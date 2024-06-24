package com.backend.services;

import java.util.List;
import java.util.stream.Collectors;

import com.backend.repositories.ProgramRepository;
import com.backend.repositories.UserRepository;
import com.backend.resources.ProgramResource;
import com.backend.resources.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.entities.User;

@Service
public class UserService {
  @Autowired
  private ProgramRepository programRepository;
  @Autowired
  private UserRepository userRepository;
 
  public List<UserResource> getAllUser() {
    return (List<UserResource>) userRepository.findAll()
                                .stream()
                                .map(user -> new UserResource(user))
                                .collect(Collectors.toList());
  }
  
  public List<UserResource> getAllUserByProgram(long programId) {
    List<UserResource> users = programRepository.findById(programId)
                                .get()
                                .getUsers()
                                .stream()
                                .map(user -> new UserResource(user))
                                .collect(Collectors.toList());
    return users;
  }
  
  public List<ProgramResource> getAllProgramByUser(long uid) {
    return userRepository.findProgramById(uid)
                                .stream()
                                .map(program -> new ProgramResource(program))
                                .collect(Collectors.toList());
  }
  
  public User getUser(long id) {
    return userRepository.findById(id).get();
  }
}
