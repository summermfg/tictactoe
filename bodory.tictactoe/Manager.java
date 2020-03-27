package bodory.tictactoe;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Manager {

		static int[][] board = new int[3][3];
		Scanner s1 = new Scanner(System.in);


		public boolean checkWinner() {

			boolean winner = false;

			if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != 0) {
			winner = true;
			}
			else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != 0) {
			winner = true;
			}
			else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != 0) {
			winner = true;
			}
			else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != 0) {
			winner = true;
			}
			else if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != 0) {
			winner = true;
			}
			else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != 0) {
			winner = true;
			}
			else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0) {
			winner = true;
			}
			else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0) {
			winner = true;
			}
			return winner;
		}

	public void setSign(boolean turnPlayer1) {

			String scannerStorage = s1.next();
			String[] scannerStorageArray = scannerStorage.split(",");
			int row = Integer.parseInt(scannerStorageArray[0]);
			int column = Integer.parseInt(scannerStorageArray[1]);

			if(turnPlayer1) {
				board[row][column] = 1;
			} else {
				board[row][column] = 2;
			}
		}

	public void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
		System.out.println("/---|---|---\\");
	}
}
