package desafioDesignPatterns;

import java.util.List;

public class Pedido {
	private List<String> itensPedidos;
	private List<Double> valoresDosItens;
	private DescontoStrategy tipoDeDesconto;
	
	public Pedido() {
		
	}
	
	public Pedido(List<String> intensPedidos, List<Double> valoresDosItens, DescontoStrategy tipoDeDesconto) {
		
	}
	
	public double calcularValorTotalDosPedidos() {
		double valorTotal = 0;
		
		for(int i = 0; i < valoresDosItens.size(); i++) {
			valorTotal += valoresDosItens.get(i);
		}
		
		return valorTotal;
	}


	public List<String> getItensPedidos() {
		return itensPedidos;
	}


	public void setItensPedidos(List<String> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}


	public List<Double> getValoresDosItens() {
		return valoresDosItens;
	}


	public void setValoresDosItens(List<Double> valoresDosItens) {
		this.valoresDosItens = valoresDosItens;
	}


	public DescontoStrategy getTipoDeDesconto() {
		return tipoDeDesconto;
	}


	public void setTipoDeDesconto(DescontoStrategy tipoDeDesconto) {
		this.tipoDeDesconto = tipoDeDesconto;
	}
	
	
}
