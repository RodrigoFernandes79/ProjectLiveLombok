package expectostech.dio.live.lombock.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data // -> Substitui os metodos Getters and Setters e ToStrings da classe(Lombok)
@Entity(name = "pedidoItem")
public class PedidoItemModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL) // vários items de pedido possui um  produto. Cascade Type para formatar em listas
	//lá no Insomnia
	private ProdutoModel produto; // preciso saber quais os produtos estao relacionados nesse item
	
	private BigDecimal preco;

	
	

}
