package net.hamzaouggadi.contentms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    @Id
    private String articleId;
    private String articleTitle;
    private String articleContent;
    private String articleImage;
    private Date articlePublishDate;
}
