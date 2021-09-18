package expectostech.dio.live.lombock.model;
import java.math.BigDecimal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data // -> Substitui os metodos Getters and Setters e ToStrings da classe(Lombok)
@Entity(name = "pedido")
public class PedidoModel {
	@Id
	private String id; // Colocamos o id como integer pois se trata de uma consulta de itens(vamos usar
	//esse id para consultar o id de PedidoItemModel.
	@ManyToOne(cascade =CascadeType.ALL)  // muitos pedidos de um cliente. Cascade Type para formatar em listas
	//lá no Insomnia
	private ClienteModel cliente;
	@OneToMany(cascade = CascadeType.ALL) // um pedido tem muitos itens. Cascade Type para formatar em listas
	//lá no Insomnia
	private List<PedidoItemModel> itens;  // criei uma lista de itens de pedidos
	
}
