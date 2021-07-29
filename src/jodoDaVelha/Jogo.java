package jodoDaVelha;

import java.util.Scanner;

public class Jogo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		JV jogo = new JV();
		String posicao;
		int valida = 0, jogadas = 0;
		
		//while infinito, o que quer dizer
		//enquanto meu while for true ele continuara rodando
		//só vai da false quando alguém ganhar
		while(true)
		{
			System.out.println("!!!Jogo da Velha!!!");
			jogo.Mostrar();//se eu deixar apenas o jogo.Mostrar() fica um laço infinito
			
			//jogador 1
			do {
				System.out.println("Jogador 1, informe uma posição: ");
				posicao = leia.next();
				while(!jogo.Valido(posicao))
					{
						System.out.println("Jogada inválida, tente novamente!");
						System.out.println("Jogador 1, informe uma posição: ");
						posicao = leia.next();
						valida = 0;
					}
				jogo.Jogada(posicao,"X");
				valida = 1;
				
			}while(valida == 0);// fim jogador
			
			jogadas++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhei(jogadas).equals("null"))
			{
				break;
			}
			
			//jogador 2
			do {
				System.out.println("Jogador 2, informe uma posição: ");
				posicao = leia.next();
				while(!jogo.Valido(posicao))
					{
						System.out.println("Jogada inválida, tente novamente!");
						System.out.println("Jogador 2, informe uma posição: ");
						posicao = leia.next();
						valida = 0;
					}
				jogo.Jogada(posicao,"()");
				valida = 1;
				
			}while(valida == 0);
			
			jogadas++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhei(jogadas).equals("null"))
			{
				break;
			}
		}
		
		System.out.println("O "+jogo.Ganhei(jogadas)+" venceu!");
	}

}
