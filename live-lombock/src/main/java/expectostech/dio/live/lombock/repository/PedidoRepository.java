package expectostech.dio.live.lombock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import expectostech.dio.live.lombock.model.PedidoModel;

public interface PedidoRepository extends JpaRepository<PedidoModel, String>{

}
