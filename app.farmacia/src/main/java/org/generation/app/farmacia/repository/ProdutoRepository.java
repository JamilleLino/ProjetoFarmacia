package org.generation.app.farmacia.repository;

import org.generation.app.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
