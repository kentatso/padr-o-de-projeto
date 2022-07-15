
public interface IConta { //Interface � uma classe abstrata com todos os m�todos abstratos.
	
	void sacar(double valor); /*n�o precisa colocar public antes dos m�todos, pois n�o faz sentido uma interface n�o ser publica, e como ela ja est�
	como publica na sua declara��o, os m�todos tamb�m s�o publicos, mesmo sem escrever.*/
	
	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
