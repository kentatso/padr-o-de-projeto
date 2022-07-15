
public abstract class Conta implements IConta { /*essa classe foi definida como abstract, para que s� as filhas possam instanci�-la.*/
	
	private static final int AGENCIA_PADRAO = 1; /*AGENCIA_PADRAO � uma constante para definir a agencia ela foi definida como final, pois ela
n�o ter� altera��o, a agencia � padr�o, tanto para conta corrente, quanto para conta poupana�a.*/
	
	private static int SEQUENCIAL = 1; /*SEQUENCIAL � uma constante que foi criada para gerar os n�meros das contas*/
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public void sacar(double valor) {	
		saldo = saldo-valor;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public void transferir(double valor, Conta contaDestino) {	
		this.sacar(valor);
		contaDestino.depositar(valor); 
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
		
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	

}
