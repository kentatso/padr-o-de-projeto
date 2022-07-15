
public class ExemploArrayObjeto {
	
	public static void main(String[] args) {
		
		Funcionario[] func =  new Funcionario[3];
		
		func [0] = new Funcionario(200, "Manoel", 2500.15);
		func [1] = new Funcionario(201, "Joaquim", 1200.5);
		func [2] = new Funcionario(220, "Maria", 2000.0);
		
		for (Funcionario f : func) { //Para cada funcionario f dentro do array func execute:
			System.out.println("Funcionário" + f.getNome() + " - Salário: " + f.getSalario() );
		}
		
	}

}
