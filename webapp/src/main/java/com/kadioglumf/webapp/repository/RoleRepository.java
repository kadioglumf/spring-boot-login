package com.kadioglumf.webapp.repository;

import com.kadioglumf.webapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {

    Role findRoleByName(String theRoleName);
}
