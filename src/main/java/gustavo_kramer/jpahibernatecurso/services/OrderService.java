package gustavo_kramer.jpahibernatecurso.services;

import gustavo_kramer.jpahibernatecurso.entities.Order;
import gustavo_kramer.jpahibernatecurso.entities.Usuario;
import gustavo_kramer.jpahibernatecurso.repositories.OrderRepository;
import gustavo_kramer.jpahibernatecurso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
