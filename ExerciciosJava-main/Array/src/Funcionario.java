
public class Funcionario {
	
	private int matricula;
	private String nome;
	private double salario;
	
	public Funcionario(int mat, String nm, double sal) {
		this.matricula = mat;
		this.nome = nm;
		this.salario = sal;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
