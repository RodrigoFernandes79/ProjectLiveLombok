package expectostech.dio.live.lombock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expectostech.dio.live.lombock.model.ClienteModel;
import expectostech.dio.live.lombock.repository.ClienteRepository;
import expectostech.dio.live.lombock.repository.PedidoRepository;
import lombok.AllArgsConstructor;

@RestController  // -> Informa ao Spring Boot que essa é uma classe controller(DAO)
@RequestMapping({"/cliente"}) // solicita mapeamento para o localhost:8090/cliente
@AllArgsConstructor // Lombok que substitui a criação do constutor da classe (ClienteController)
public class ClienteController {

	private final ClienteRepository repository;
	
	// Lombok que substitui a criação do constutor da classe (ClienteController)
//	public  ClienteController(ClienteRepository repository) {
//		this.repository = repository;
//	}
	
	//@GetMapping -> API Rest para listar dados
	@GetMapping({"/listartodos"}) // localhost:8090/cliente/listartodos  -> exibe lista de dados
	public ResponseEntity<List<ClienteModel>>listarTodos(){
		return ResponseEntity.ok(repository.findAll());
		
		
	}//@PostMapping -> API Rest para adicionar dados
	@PostMapping({"/salvardados"})// localhost:8090/cliente/salvardados  -> adiciona dados
	public ResponseEntity<ClienteModel>inserirDados(@RequestBody ClienteModel cliente){
													//@RequestBody transforma os dados na linguagem JSON
		return ResponseEntity.ok(repository.save(cliente)); // salva dados na tabela cliente
		
	}
	

}
