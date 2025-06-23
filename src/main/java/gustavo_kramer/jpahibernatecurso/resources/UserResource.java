package gustavo_kramer.jpahibernatecurso.resources;

import gustavo_kramer.jpahibernatecurso.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll() {
        Usuario u = new Usuario(1L,"Maria","Maria@gmail.com","99999999999","12345");
        return ResponseEntity.ok().body(u);
    }
}
