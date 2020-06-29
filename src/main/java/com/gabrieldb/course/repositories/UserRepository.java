package com.gabrieldb.course.repositories;

import com.gabrieldb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
