//Exerc�cio

/*Verificando se um n�mero � par ou �mpar
 * 1. Crie uma classe e insira a estrutura b�sica de um programa Java;
 * 2. Declare uma vari�vel do tipo int com o nome valor e atribua um valor;
 * 3. Usando o operador tern�rio, verifique se o n�mero � par ou �mpar e imprima na tela;
 * 4. Compile e execute o programa.O resultado deve ser como o exibido a seguir: Par
 */
public class ParImpar {
	public static void main(String[] args) {
		int valor = 10;
		System.out.println((valor % 2 == 0) ? "Par" : "�mpar");
				
	}
}
