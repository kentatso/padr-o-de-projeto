
public class TesteSwitch {
	
public static void main(String[] args) {
	String pais = "Franca";
	
	switch (pais) {
	case "Brasil":
	case "Portugal":
		System.out.println("Bom dia!");
		break;
	case "Espanha":
	case "Mexico":
	case "Argentina":
		System.out.println("Buenos dias!");
		break;
	case "Franca":
		System.out.println("Bon jour!");
		break;
	default:
		System.out.println("Good morning!");
	
	}
}
}
