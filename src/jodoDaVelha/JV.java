package jodoDaVelha;

public class JV {
	
	private String [][] m = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	//montando o jogo da velha
	public String Mostrar()
	{
		for(int li=0;li<3;li++){
			 for(int co=0;co<3;co++){
				 
				 System.out.printf("   "+m[li][co]);
			 }
			 System.out.println("\n");
		 }
		return null;
	}//----------------------
	//posicionamento
	public boolean Valido(String p)
	{
		for(int li=0;li<3;li++) {
			for(int co=0;co<3;co++) {
				
				if(m[li][co].equals(p)) {
					return true;
				}
			}
		}
		return false;
	}//------------------
	//colocando as jogadas do usuario
	public void Jogada(String p, String j)
	{
		if(p.equals("1")) {
			m[0][0] = j;
		}
		else if(p.equals("2")) {
			m[0][1] = j;
		}
		else if(p.equals("3")) {
			m[0][2] = j;
		}
		else if(p.equals("4")) {
			m[1][0] = j;
		}
		else if(p.equals("5")) {
			m[1][1] = j;
		}
		else if(p.equals("6")) {
			m[1][2] = j;
		}
		else if(p.equals("7")) {
			m[2][0] = j;
		}
		else if(p.equals("8")) {
			m[2][1] = j;
		}
		else if(p.equals("9")) {
			m[2][2] = j;
		}
		
	}//----------------
	//verificando vencedor
	public String Ganhei(int jogadas)
	{
		String[] T = new String[8];
		String vencedor = "null";
		if(jogadas == 9) {
			vencedor = "EMPATE!";
		}
		T[0] = m[0][0] + m[0][1] + m[0][2];
		T[1] = m[1][0] + m[1][1] + m[1][2];
		T[2] = m[2][0] + m[2][1] + m[2][2];
		
		T[3] = m[0][0] + m[0][1] + m[0][2];
		T[4] = m[1][0] + m[1][1] + m[1][2];
		T[5] = m[2][0] + m[2][1] + m[2][2];
		
		T[6] = m[0][0] + m[0][1] + m[0][2];
		T[7] = m[1][0] + m[1][1] + m[1][2];
		
		for(int i=0;i<T.length;i++) {
			if(T[i].equals("XXX")) {
				vencedor = "Jogador 1";
			}
			else if(T[i].equals("()()()"))
			{
				vencedor = "Jogador 2";
			}
		}
		return vencedor;
	}
}