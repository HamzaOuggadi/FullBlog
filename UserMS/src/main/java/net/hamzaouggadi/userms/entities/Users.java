package net.hamzaouggadi.userms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PERMISSION", length = 12)
public abstract class Users {
    @Id
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Date userCreatedAt;
//    private Permission userPermission;
}
