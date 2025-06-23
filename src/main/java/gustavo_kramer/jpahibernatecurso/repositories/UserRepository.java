package gustavo_kramer.jpahibernatecurso.repositories;

import gustavo_kramer.jpahibernatecurso.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
}
