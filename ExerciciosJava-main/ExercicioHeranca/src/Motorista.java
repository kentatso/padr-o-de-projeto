
public class Motorista extends Funcionario {// extends Funcionarios � para utilizar os atributos e m�todos da classe
											// Funcionarios como Heran�a.

	private String cnh;
	private String placaAutomovel;
	
	public Motorista(int mat, String nm, double sal, String cnh, String placa) {
		super(mat, nm, sal);
		this.cnh = cnh;
		this.placaAutomovel = placa; // o this foi usado para a cnh e a placa, pois ele n�o est� dentro da classe motorista, por isso n�o pode estar dentro de super.
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPlacaAutomovel() {
		return placaAutomovel;
	}

	public void setPlacaAutomovel(String placaAutomovel) {
		this.placaAutomovel = placaAutomovel;
	}
}
