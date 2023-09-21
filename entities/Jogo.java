package entities;

import java.util.Scanner;

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

	public void xJoga(Scanner sc) {
		System.out.println("Linha: ");
		int linha = sc.nextInt();
		System.out.println("Coluna: ");
		int coluna = sc.nextInt();
		pecas[linha][coluna] = "X";
	}

	public void bJoga(Scanner sc) {
		System.out.println("Linha: ");
		int linha = sc.nextInt();
		System.out.println("Coluna: ");
		int coluna = sc.nextInt();
		pecas[linha][coluna] = "B";
	}

	public int empate() {
		// se der empate retorna 1

		return 0;
	}

	public int vitoriaEmLinha() {
		// se X vencer em linha retorna 1
		if (pecas[0][0] == "X" && pecas[0][1] == "X" && pecas[0][2] == "X") {
			return 1;
		}
		if (pecas[1][0] == "X" && pecas[1][1] == "X" && pecas[1][2] == "X") {
			return 1;
		}
		if (pecas[2][0] == "X" && pecas[2][1] == "X" && pecas[2][2] == "X") {
			return 1;
		}
		// se nao, se B vencer em linha retorna 2
		if (pecas[0][0] == "B" && pecas[0][1] == "B" && pecas[0][2] == "B") {
			return 2;
		}
		if (pecas[1][0] == "B" && pecas[1][1] == "B" && pecas[1][2] == "B") {
			return 1;
		}
		if (pecas[2][0] == "B" && pecas[2][1] == "B" && pecas[2][2] == "B") {
			return 1;
		}
		return 0;
	}

	public int vitoriaEmColuna() {
		// se X vencer em coluna retorna 1
		if (pecas[0][0] == "X" && pecas[1][0] == "X" && pecas[2][0] == "X") {
			return 1;
		}
		if (pecas[0][1] == "X" && pecas[1][1] == "X" && pecas[2][1] == "X") {
			return 1;
		}
		if (pecas[1][0] == "X" && pecas[1][1] == "X" && pecas[1][2] == "X") {
			return 1;
		}

		// se nao, se B vencer em coluna retorna 2
		if (pecas[0][0] == "B" && pecas[1][0] == "B" && pecas[2][0] == "B") {
			return 1;
		}
		if (pecas[0][1] == "B" && pecas[1][1] == "B" && pecas[2][1] == "B") {
			return 1;
		}
		if (pecas[1][0] == "B" && pecas[1][1] == "B" && pecas[1][2] == "B") {
			return 1;
		}
		return 0;
	}

	public int vitoriaEmDiagonal() {
		// se X vencer em diagonal retorna 1
		if (pecas[0][0] == "X" && pecas[1][1] == "X" && pecas[2][2] == "X") {
			return 1;
		}
		if (pecas[0][2] == "X" && pecas[1][1] == "X" && pecas[2][0] == "X") {
			return 1;
		}

		// se nao, se B vencer em diagonal retorna 2
		if (pecas[0][0] == "B" && pecas[1][1] == "B" && pecas[2][2] == "B") {
			return 2;
		}
		if (pecas[0][2] == "B" && pecas[1][1] == "B" && pecas[2][0] == "B") {
			return 2;
		}

		return 1;
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
