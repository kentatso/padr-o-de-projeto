
/**
 * @author Rita Cassia
 *
 */
public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	//criando o construtor:
	public Conta(int nm, String no, double sl) {
		numero = nm;
		nome = no;
		saldo = sl;
	}
	// criando um construtor vazio
	
	public Conta() {
		numero = 0;
		nome = "";
		saldo = 0;
	}
	
	//metodos Get e Set:
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getDados() {
		return numero + " - " + nome + " - " + saldo;
	}

}
