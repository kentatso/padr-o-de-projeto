/*ConstrutoresB – Testando a classe Cadastro
 * 1. Crie uma classe com o nome Aula8_Lab1 e insira a estrutura básica de um programa Java;
 * 2. Crie três objetos da classe Cadastro. No primeiro, use o construtor padrão, no segundo, passe duas 
strings como parâmetros no construtor e, no terceiro, passe duas strings e um int como parâmetros;
 * 3.  Use  o  método  mostrar  da  classe  Cadastro  para  exibir  os  valores  dos  atributos  de  cada  objeto;
 * 4. Compile e execute o programa.
 */

package cadastro;

public class Aula8_Lab1 {
	public static void main(String[] args) {
		
		Cadastro c1 = new Cadastro();
		Cadastro c2 = new Cadastro("Rita", "Carvalho");
		Cadastro c3 = new Cadastro("Rita", "Carvalho", 35);
		
		System.out.println(c1.mostrarDados());
		System.out.println(c2.mostrarDados());
		System.out.println(c3.mostrarDados());
		
	}
}
