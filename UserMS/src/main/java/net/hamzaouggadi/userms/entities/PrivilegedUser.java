package net.hamzaouggadi.userms.entities;


import jakarta.persistence.Entity;

import java.util.Date;
@Entity
public abstract class PrivilegedUser extends User{
    private Date dateOfPrivilege;
}
