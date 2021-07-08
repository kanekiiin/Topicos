package modelos;

import java.io.Serializable;
import javax.websocket.Decoder.Text;

public class Produtos implements Serializable{

	private Integer id;
	private String descricao;
	private String uri;
	private String name;
	private Double preco;
	
	public Produtos (){}

	public Integer getId() {
		return id;
	}

	public void setId(long l) {
		this.id = (int) l;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String string) {
		this.descricao = string;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produtos [id=" + id + ", descricao=" + descricao + ", uri=" + uri + ", name=" + name + ", preco="
				+ preco + "]";
	}
	
	
}
