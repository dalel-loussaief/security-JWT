package com.dalel.users.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dalel.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
