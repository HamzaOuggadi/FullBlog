package net.hamzaouggadi.userms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.Date;
@Entity
public abstract class User {
    @Id
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Date userCreatedAt;
    @OneToOne
    private Permission userPermission;
}
