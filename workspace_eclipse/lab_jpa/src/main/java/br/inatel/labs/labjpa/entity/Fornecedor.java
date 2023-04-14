package br.inatel.labs.labjpa.entity;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Fornecedor {

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Fornecedor() {
		super();
	}

	public Fornecedor(String razaoSocial) {
		super();
		this.razaoSocial = razaoSocial;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return id == other.id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Produto> getListaProduto() {
		return ListaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		ListaProduto = listaProduto;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", razaoSocial=" + razaoSocial + "]";
	}

	@ManyToMany // Dominante
	private List<Produto> ListaProduto;

	@NotNull
	@Size(min = 2, max = 100)
	private String razaoSocial;
}
