

public class Main {
	
	public static void main(String[] args) {
		
		//Calculadora
		
		System.out.println("Exercício calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5); 
		
		
		//Mensage hora do dia
		
		System.out.println("Exercício Mensagem");
		MensagemHoraDoDia.obterMensagem(12);
		MensagemHoraDoDia.obterMensagem(30);
		MensagemHoraDoDia.obterMensagem(7);
		MensagemHoraDoDia.obterMensagem(20);
		MensagemHoraDoDia.obterMensagem(15);
		
		//Empéstimo
		
		System.out.println("Exercicio empréstimo");
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(1000, Emprestimo.duasParcelas());
		Emprestimo.calcular(1000, Emprestimo.tresParcelas());
		Emprestimo.calcular(1000, 5);
	}
}
