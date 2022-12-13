package net.hamzaouggadi.userms.repositories;

import net.hamzaouggadi.userms.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {
}
