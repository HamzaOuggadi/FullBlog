package net.hamzaouggadi.userms.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("EDITOR")
public class Editor extends PrivilegedUser{
    private int editorRank;
}
