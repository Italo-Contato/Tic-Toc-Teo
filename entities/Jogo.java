package entities;

public class Jogo {
	String[][] pecas = new String[3][3];

	public Jogo() {
		for(int i = 0 ; i < pecas.length; i++) {
			//incia o jogo, cada "_" é um espaço vazio no jogo
			for(int j = 0; j < pecas[0].length; j++) {
				pecas[i][j] = "_";
			}
		}
	}

	public void xJoga() {

	}

	public void bJoga() {

	}

	public int empate() {
		// se der empate retorna 1
		return 0;
	}

	public int vitoriaEmLinha() {
		// se X vencer em linha retorna 2
		// se nao, se B vencer em linha retorna 3
		return 0;
	}

	public int vitoriaEmColuna() {
		// se X vencer em coluna retorna 2
		// se nao, se B vencer em coluna retorna 3
		return 0;
	}

	public void vitoriaEmDiagonal() {
		// se X vencer em diagonal retorna 2
		// se nao, se B vencer em diagonal retorna 3
	}

	public String[][] getPecas() {
		return pecas;
	}

}
