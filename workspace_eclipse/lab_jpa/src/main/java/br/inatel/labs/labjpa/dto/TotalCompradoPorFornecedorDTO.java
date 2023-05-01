package br.inatel.labs.labjpa.dto;

import java.math.BigDecimal;

public class TotalCompradoPorFornecedorDTO {

	private String fornecedorRazaoSocial;
	private BigDecimal totalComprado;

	public TotalCompradoPorFornecedorDTO(String fRazaoSocial, BigDecimal total) {
		this.fornecedorRazaoSocial = fRazaoSocial;
		this.totalComprado = total;

	}

	@Override
	public String toString() {
		return "TotalCompradoPorFornecedorDTO [fornecedorRazaoSocial=" + fornecedorRazaoSocial + ", totalComprado="
				+ totalComprado + ", getFornecedorRazaoSocial()=" + getFornecedorRazaoSocial() + ", getTotalComprado()="
				+ getTotalComprado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getFornecedorRazaoSocial() {
		return fornecedorRazaoSocial;
	}

	public void setFornecedorRazaoSocial(String fornecedorRazaoSocial) {
		this.fornecedorRazaoSocial = fornecedorRazaoSocial;
	}

	public BigDecimal getTotalComprado() {
		return totalComprado;
	}

	public void setTotalComprado(BigDecimal totalComprado) {
		this.totalComprado = totalComprado;
	}
}
