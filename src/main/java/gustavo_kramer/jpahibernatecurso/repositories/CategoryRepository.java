package gustavo_kramer.jpahibernatecurso.repositories;

import gustavo_kramer.jpahibernatecurso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
