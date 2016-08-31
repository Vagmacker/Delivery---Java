package code.delivery.repository;

import code.delivery.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by joao on 29/08/16.
 */
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    @Override

    public List<Produtos> findAll();

    public Produtos findById(long id);

    public Produtos findByName(String name);
}
