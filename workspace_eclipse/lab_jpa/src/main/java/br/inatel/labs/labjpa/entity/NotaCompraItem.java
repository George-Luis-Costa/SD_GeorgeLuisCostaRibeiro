package br.inatel.labs.labjpa.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class NotaCompraItem {

	private long id;
	private NotaCompra notacompra;
	private BigDecimal valorCompraProduto;
	private Integer quantidade = 1;
	
	public BigDecimal getCalculoTotalItem() {
		return valorCompraProduto.multiply(BigDecimal.valueOf(quantidade));
	}
}
