
public class Teste {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(4003, "Manoel", 1530.15); // usando construtor com valores
		Conta c2 = new Conta(); //usando construtor vazio
		Conta c3 = new Conta(4007, "Maria", 1250.44); // usando construtor com valores
		
		System.out.println(c1.getDados());
		System.out.println(c2.getDados());
		System.out.println(c3.getDados());
	}

}
