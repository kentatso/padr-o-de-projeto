/*Criando a classe Cadastro com múltiplos construtores
 * 1. Crie uma classe com o nome Cadastro e declare os atributos privados nome, sobrenomee idade;
 * 2. Crie os assessores getter e setter para cada atributo;
 * 3. Insira o construtor padrão da classe;
 * 4.  Crie  um  construtor  que  receba  os  parâmetros  nome  e  sobrenome  e  atribua  os  valores  desses parâmetros aos atributos da classe;
 * 5. Crie outro construtor que receba os parâmetros nome, sobrenome e idade e atribua os valores desses parâmetros aos atributos da classe;
 * 6. Crie um método chamado mostrar que exiba na tela o valor de cada atributo da classe;
 * 7. Salve e compile a classe.
 */

package cadastro;

public class Cadastro {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
public Cadastro() {
	nome = "";
	sobrenome = "";
	idade = 0;
}
	
public Cadastro(String no, String so) {
	nome = no;
	sobrenome = so;
}

public Cadastro(String no, String so, int id) {
	nome = no;
	sobrenome = so;
	idade = id;
}

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String mostrarDados() {
		return nome + " " + " "+ sobrenome + " " + " " + idade;
	}

	
}
