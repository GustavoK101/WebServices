package gustavo_kramer.jpahibernatecurso.repositories;

import gustavo_kramer.jpahibernatecurso.entities.Category;
import gustavo_kramer.jpahibernatecurso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
