
public class Emprestimo {
	
	public static int duasParcelas() {
		return 2;
	}	
	public static int tresParcelas() {
		return 3;
	}
	
	public static double taxaDuasParcelas() {
		return 0.3;	
	}
	
	public static double taxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) {
		if(parcelas == 2) {
			System.out.println("O valor final do empr�stimo para 2 parcelas � R$ " + (valor * taxaDuasParcelas() + valor));
		}else if (parcelas == 3) {
			System.out.println("O valor final do empr�stimo para 3 parcelas � R$ " + (valor * taxaTresParcelas() + valor));
		}else {
			System.out.println("Valor de parcelas n�o permitido");
		}
	}
}
