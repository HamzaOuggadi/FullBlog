package net.hamzaouggadi.userms.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends PrivilegedUser{
}
