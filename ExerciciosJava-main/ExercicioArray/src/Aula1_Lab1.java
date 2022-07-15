/*Laboratório 1
 * Neste laboratório, vamos criar um método que receba um array do tipo int e retorne o maior número deste array.
 * A – Criando um método que retorne o maior número de um array
 * 1.  Crie  uma  classe  com  o  nome  Aula1_Lab1 e,  nela,  crie  um  método  estático  chamado  maiorNumero que retorne int e receba um array do tipo 
int como parâmetro;
 * 2. Dentro do método maiorNumero, crie uma variável do tipo int com o nome maior e inicialize com 0;
 * 3. Faça um for que percorra todo o array e, dentro dele, verifique se cada elemento do array é maior que a variável maior. Caso seja verdadeiro, atribua 
o elemento do array à variável maior;
 * 4. Logo após o laço for, retorne a variável maior;
 * 5. Insira a estrutura básica de um programa Java e, dentro dele, declare um array do tipo intcom o nome numeros e o inicialize com quantos números quiser;
 * 6. Declare uma variável do tipo int com o nome maior e atribua à ela o método maiorNumeropassando como parâmetro o array numeros;
 * 7. Imprima a variável maior na tela;
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
		
		System.out.println("O maior número do array é " + maior);
	}
		
	}

