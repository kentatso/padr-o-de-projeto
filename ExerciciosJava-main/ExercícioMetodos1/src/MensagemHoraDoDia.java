
public class MensagemHoraDoDia {
	
	public static void obterMensagem(int hora) {
		if(hora >= 0 && hora <= 12) {
			System.out.println("Bom dia!");
		} else if (hora > 12 && hora <= 18) {
			System.out.println("Boa tarde!");
		} else if (hora > 18 && hora < 23) {
			System.out.println("Boa noite!");
		} else {
				System.out.println("hora inválida!");
			}
		}
	}


