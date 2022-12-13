package net.hamzaouggadi.contentms.repositories;

import net.hamzaouggadi.contentms.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
