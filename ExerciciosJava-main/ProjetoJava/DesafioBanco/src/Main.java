
public class Main {
	
	public static void main(String[] args) {
		Cliente rita = new Cliente();
		rita.setNome("Rita");
		
		Conta cc = new ContaCorrente(rita);
		cc.depositar(100.00);
		
		Conta cp = new ContaPoupanca(rita);
		cc.transferir(50.00, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
