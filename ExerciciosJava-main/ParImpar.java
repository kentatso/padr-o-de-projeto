//Exercício

/*Verificando se um número é par ou ímpar
 * 1. Crie uma classe e insira a estrutura básica de um programa Java;
 * 2. Declare uma variável do tipo int com o nome valor e atribua um valor;
 * 3. Usando o operador ternário, verifique se o número é par ou ímpar e imprima na tela;
 * 4. Compile e execute o programa.O resultado deve ser como o exibido a seguir: Par
 */
public class ParImpar {
	public static void main(String[] args) {
		int valor = 10;
		System.out.println((valor % 2 == 0) ? "Par" : "Ímpar");
				
	}
}
