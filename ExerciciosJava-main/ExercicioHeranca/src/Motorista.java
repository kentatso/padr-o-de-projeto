
public class Motorista extends Funcionario {// extends Funcionarios é para utilizar os atributos e métodos da classe
											// Funcionarios como Herança.

	private String cnh;
	private String placaAutomovel;
	
	public Motorista(int mat, String nm, double sal, String cnh, String placa) {
		super(mat, nm, sal);
		this.cnh = cnh;
		this.placaAutomovel = placa; // o this foi usado para a cnh e a placa, pois ele não está dentro da classe motorista, por isso não pode estar dentro de super.
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
