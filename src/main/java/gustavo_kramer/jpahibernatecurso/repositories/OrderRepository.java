package gustavo_kramer.jpahibernatecurso.repositories;

import gustavo_kramer.jpahibernatecurso.entities.Order;
import gustavo_kramer.jpahibernatecurso.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
