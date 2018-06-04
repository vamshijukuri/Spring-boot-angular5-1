package com.devglan.userportal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);
}
