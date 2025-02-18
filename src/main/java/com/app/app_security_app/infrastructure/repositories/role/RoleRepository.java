package com.app.app_security_app.infrastructure.repositories.role;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.app.app_security_app.domain.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
    Optional<Role> findByName(String name);
}
