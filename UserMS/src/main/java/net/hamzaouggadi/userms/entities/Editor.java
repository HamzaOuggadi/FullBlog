package net.hamzaouggadi.userms.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Editor extends PrivilegedUser{
    private int editorRank;
}
