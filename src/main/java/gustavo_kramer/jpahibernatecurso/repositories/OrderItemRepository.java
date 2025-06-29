package gustavo_kramer.jpahibernatecurso.repositories;

import gustavo_kramer.jpahibernatecurso.entities.OrderItem;
import gustavo_kramer.jpahibernatecurso.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
