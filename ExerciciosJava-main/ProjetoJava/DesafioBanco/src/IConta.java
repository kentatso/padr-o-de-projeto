
public interface IConta { //Interface é uma classe abstrata com todos os métodos abstratos.
	
	void sacar(double valor); /*não precisa colocar public antes dos métodos, pois não faz sentido uma interface não ser publica, e como ela ja está
	como publica na sua declaração, os métodos também são publicos, mesmo sem escrever.*/
	
	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
