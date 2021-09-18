package expectostech.dio.live.lombock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import expectostech.dio.live.lombock.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
	
	

}
