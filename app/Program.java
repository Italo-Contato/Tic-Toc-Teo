package app;

import java.util.Scanner;

import entities.Jogo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		Jogo jg = new Jogo();
		UI ui = new UI();
		ui.começa(jg, sc);

	}

}
