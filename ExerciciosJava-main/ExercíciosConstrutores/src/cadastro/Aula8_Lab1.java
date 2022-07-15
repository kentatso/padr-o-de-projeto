/*ConstrutoresB � Testando a classe Cadastro
 * 1. Crie uma classe com o nome Aula8_Lab1 e insira a estrutura b�sica de um programa Java;
 * 2. Crie tr�s objetos da classe Cadastro. No primeiro, use o construtor padr�o, no segundo, passe duas 
strings como par�metros no construtor e, no terceiro, passe duas strings e um int como par�metros;
 * 3.  Use  o  m�todo  mostrar  da  classe  Cadastro  para  exibir  os  valores  dos  atributos  de  cada  objeto;
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
