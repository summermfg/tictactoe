package bodory.tictactoe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			boolean turnPlayer1 = true;
			Manager m = new Manager();

			m.printBoard();

			while(true) {

				m.setSign(turnPlayer1);

				boolean won = m.checkWinner();
				m.printBoard();
				m.checkWinner();

			if (won == true) {
				if (turnPlayer1) {
					System.out.println("Winner: Player 1");
				} else {
					System.out.println("Winner: Player 2");
				}
			}
			turnPlayer1 = !turnPlayer1;
			}
		}
}
