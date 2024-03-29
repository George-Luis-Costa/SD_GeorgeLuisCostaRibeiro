package br.inatel.labs.labjpa.entity;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	//construtor
	
	public Produto(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	//acessores
	public long getId() {
		return id;
	}

	public Produto() {
		super();
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Fornecedor> getListaFornecedor() {
		return listaFornecedor;
	}

	public void setListaFornecedor(List<Fornecedor> listaFornecedor) {
		this.listaFornecedor = listaFornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}

	@ManyToMany(mappedBy = "ListaProduto")
	private List<Fornecedor> listaFornecedor;

	@NotNull
	@Size(min = 2, max = 100)
	private String descricao;

}
