package code.delivery.service;

import code.delivery.entity.Produtos;
import code.delivery.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by joao on 30/08/16.
 */
@Service
public class ProdutoService implements AbstractServiceInterface<Produtos>{

    @Autowired
    private ProdutosRepository produtosRepository;

    @Override
    public void save(Produtos produtos) {
        if (produtos.getId() == 0){
            validate(produtos);
        }

        produtosRepository.save(produtos);
    }

    @Override
    public void update(Produtos produtos) {
        produtosRepository.save(produtos);
    }

    @Override
    public boolean delete(long id) {

        Produtos produtos = produtosRepository.findOne(id);

        if(produtos != null) {
            produtosRepository.delete(id);
            return true;
        }

        return false;
    }

    @Override
    public List<Produtos> list() {
        return produtosRepository.findAll();
    }

    @Override
    public Produtos findById(long id) {
        Produtos produtos = produtosRepository.findOne(id);

        if(produtos == null){
            throw new RuntimeException("Produtos não existe");
        }

        return produtos;
    }

    public void validate (Produtos produtos){
        if(produtosRepository.findByName(produtos.getName()) != null) {
            throw new RuntimeException(String.format("Produto Já existe", produtos));
        }
    }
}
