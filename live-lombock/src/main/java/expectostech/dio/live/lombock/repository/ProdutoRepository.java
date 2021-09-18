package expectostech.dio.live.lombock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import expectostech.dio.live.lombock.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}
