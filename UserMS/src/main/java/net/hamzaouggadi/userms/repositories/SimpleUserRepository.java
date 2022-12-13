package net.hamzaouggadi.userms.repositories;

import net.hamzaouggadi.userms.entities.SimpleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleUserRepository extends JpaRepository<String, SimpleUser> {
}
