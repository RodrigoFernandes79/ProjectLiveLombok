package expectostech.dio.live.lombock.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expectostech.dio.live.lombock.model.PedidoModel;
import expectostech.dio.live.lombock.repository.PedidoRepository;
import expectostech.dio.live.lombock.repository.ProdutoRepository;
import lombok.AllArgsConstructor;

@RestController  // -> Informa ao Spring Boot que essa é uma classe controller(DAO)
@RequestMapping({"/pedido"}) // solicita mapeamento para o localhost:8090/cliente
@AllArgsConstructor // Lombok que substitui a criação do constutor da classe (PedidoController)
public class PedidoController {
		
	private final PedidoRepository repository;
	
	//Lombok que substitui a criação do constutor da classe (PedidoController)
//	public PedidoController(PedidoRepository repository) {
//		this.repository = repository;
//	}
	
	//@GetMapping -> API Rest para listar dados
	@GetMapping({"/listartodos"})// localhost:8090/pedido/listartodos  -> exibe lista de dados
	public ResponseEntity <List <PedidoModel>> listarTodos(){
		return ResponseEntity.ok(repository.findAll());
	}
	//@PostMapping -> API Rest para adicionar dados
	@PostMapping({"/salvardados"})// localhost:8090/pedido/salvardados  -> adiciona dados
	public ResponseEntity <PedidoModel> inserirDados(@RequestBody PedidoModel pedido){
													//@RequestBody transforma os dados na linguagem JSON
		if(pedido.getId() == null || pedido.getId().isEmpty()) {
			pedido.setId(UUID.randomUUID().toString()); // se o id de pedido for nulo ou vazio,
			//gere automaticamente uma String do id e "set" no id do pedido.
		}
		return ResponseEntity.ok(repository.save(pedido)); // salva dados na tabela pedido
		
		
	}
}
