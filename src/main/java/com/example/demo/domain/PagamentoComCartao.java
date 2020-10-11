package com.example.demo.domain;

import javax.persistence.Entity;

import com.example.demo.domain.enums.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao(Integer id, Pedido pedido, EstadoPagamento estado, Integer numeroDeParcelas) {
		super(id, pedido, estado);
		this.numeroDeParcelas = numeroDeParcelas;
	} 
	
	
}
