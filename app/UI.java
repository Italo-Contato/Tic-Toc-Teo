package app;

import java.util.Scanner;

import entities.Jogo;

public class UI {
	public void imprimePecas(Jogo jg) {
		System.out.println(jg);
	}

	public void começa(Jogo jg, Scanner sc) {
		System.out.println("X começa");
		do {

			if (jg.vitoriaEmColuna() == 0 && jg.vitoriaEmLinha() == 0 && jg.vitoriaEmDiagonal() == 0
					&& jg.empate() == 0) {
				System.out.println("Vez do X");
				jg.xJoga(sc);
				imprimePecas(jg);
			}

			if (jg.vitoriaEmColuna() == 0 && jg.vitoriaEmLinha() == 0 && jg.vitoriaEmDiagonal() == 0
					&& jg.empate() == 0) {
				System.out.println("Vez do B");
				jg.bJoga(sc);
				imprimePecas(jg);
			}
		} while (jg.vitoriaEmColuna() == 0 && jg.vitoriaEmLinha() == 0 && jg.vitoriaEmDiagonal() == 0
				&& jg.empate() == 0);
	}

}
