package edu.thiago;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem e passando os parâmetros
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro ao "apanhar" a exceção
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção caso for
		if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else if(parametroUm == parametroDois){
            System.out.println("Os parâmetros informados são iguais, portanto não será impresso nenhum número");
        }else{
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " +  ( i + 1));
        }
        }
	}
}
