package expectostech.dio.live.lombock.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import expectostech.dio.live.lombock.model.ProdutoModel;
import expectostech.dio.live.lombock.repository.ProdutoRepository;
import lombok.AllArgsConstructor;

@RestController  // -> Informa ao Spring Boot que essa é uma classe controller(DAO)
@RequestMapping({"/produto"}) // solicita mapeamento para o localhost:8090/produto
@AllArgsConstructor // Lombok que substitui a criação do constutor da classe (ProdutoController)
public class ProdutoController {
	
	private final ProdutoRepository repository;
	
	
		
	    //@GetMapping -> API Rest para listar dados
		@GetMapping({"/listartodos"})// localhost:8090/produto/listartodos  -> exibe lista de dados
		public ResponseEntity<List<ProdutoModel>> listarTodos(){
			
			return ResponseEntity.ok(repository.findAll());
		}
		
		//@PostMapping -> API Rest para adicionar dados
		@PostMapping({"/salvardados"})// localhost:8090/produto/salvardados  -> adiciona dados
		public ResponseEntity<ProdutoModel> salvarDados(@RequestBody ProdutoModel produto){
												//@RequestBody transforma os dados na linguagem JSON
			return ResponseEntity.ok(repository.save(produto));// salva dados na tabela cliente
			
		}
	}


