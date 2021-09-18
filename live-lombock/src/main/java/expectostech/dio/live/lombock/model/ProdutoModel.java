package expectostech.dio.live.lombock.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // -> Substitui os metodos Getters and Setters e ToStrings da classe(Lombok)
@Entity(name= "Produto") //para ser uma entidade de dados
public class ProdutoModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length = 250, nullable =false)
	private String descricao;
	@Column(length = 250, nullable =false)
	private BigDecimal preco;
	
}
