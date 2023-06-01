package com.example.md5_ss15_baith_jwt.repository;

import com.example.md5_ss15_baith_jwt.model.Role;
import com.example.md5_ss15_baith_jwt.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
