package entities;

public class Jogo {
	private String[][] pecas = new String[3][3];

	public Jogo() {
		for (int i = 0; i < pecas.length; i++) {
			// incia o jogo, cada "_" é um espaço vazio no jogo
			for (int j = 0; j < pecas[0].length; j++) {
				pecas[i][j] = "_";
			}
		}
	}

	public void xJoga() {
		System.out.println();
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < getPecas().length; i++) {
			for (int j = 0; j < getPecas()[0].length; j++) {
				sb.append(pecas[i][j] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
