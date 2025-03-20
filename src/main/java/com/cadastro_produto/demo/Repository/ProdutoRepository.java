package com.cadastro_produto.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cadastro_produto.demo.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
