package com.kadioglumf.webapp.repository;

import com.kadioglumf.webapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserName(String username);
}
