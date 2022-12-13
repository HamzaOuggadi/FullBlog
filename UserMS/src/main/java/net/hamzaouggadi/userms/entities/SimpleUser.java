package net.hamzaouggadi.userms.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SIMPLEUSER")
public class SimpleUser extends Users {
}
