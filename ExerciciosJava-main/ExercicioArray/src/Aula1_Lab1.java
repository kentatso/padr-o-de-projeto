/*Laborat�rio 1
 * Neste laborat�rio, vamos criar um m�todo que receba um array do tipo int e retorne o maior n�mero deste array.
 * A � Criando um m�todo que retorne o maior n�mero de um array
 * 1.  Crie  uma  classe  com  o  nome  Aula1_Lab1 e,  nela,  crie  um  m�todo  est�tico  chamado  maiorNumero que retorne int e receba um array do tipo 
int como par�metro;
 * 2. Dentro do m�todo maiorNumero, crie uma vari�vel do tipo int com o nome maior e inicialize com 0;
 * 3. Fa�a um for que percorra todo o array e, dentro dele, verifique se cada elemento do array � maior que a vari�vel maior. Caso seja verdadeiro, atribua 
o elemento do array � vari�vel maior;
 * 4. Logo ap�s o la�o for, retorne a vari�vel maior;
 * 5. Insira a estrutura b�sica de um programa Java e, dentro dele, declare um array do tipo intcom o nome numeros e o inicialize com quantos n�meros quiser;
 * 6. Declare uma vari�vel do tipo int com o nome maior e atribua � ela o m�todo maiorNumeropassando como par�metro o array numeros;
 * 7. Imprima a vari�vel maior na tela;
 * 8. Compile e execute o programa.
 */
public class Aula1_Lab1 {
	
	public static int maiorNumero(int array[]) {
		int maior = 0;
		for (int i=0; i < array.length; i++) {
			if(array[i] > maior) 
				maior = array[i];
		}	
		return maior;
	}
	
	public static void main(String[] args) {
		int numeros [] = {1, 50, 9, 86, 25, 3, 9, 72};
		int maior = maiorNumero(numeros);
		
		System.out.println("O maior n�mero do array � " + maior);
	}
		
	}

