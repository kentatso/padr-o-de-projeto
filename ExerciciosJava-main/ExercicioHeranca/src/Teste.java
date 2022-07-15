
public class Teste {
	
	public static void main(String[] args) {
		
		Motorista m = new Motorista(1234, "Manoel",3450.25, "23546564X", "ABC-1234");
		
		System.out.println(m.getNome());
		System.out.println(m.getMatricula());
		System.out.println(m.getSalario());
		System.out.println(m.getCnh());
		System.out.println(m.getPlacaAutomovel());
		
	}

}
