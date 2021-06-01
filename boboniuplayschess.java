import java.util.*;
/*
 * 10 10 4 3
 */

public class boboniuplayschess {
	static void printBoard(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int s = 0; s < board[i].length; s++) {
				if (s + 1 == board[i].length) {
					System.out.println(board[i][s]);
				} else
					System.out.print(board[i][s] + " ");
			}
		}
		System.out.println();
	}

	static boolean entireBoard(boolean[][] board) {
		boolean n1 = true;
		for (int i = 0; i < board.length; i++) {
			for (int s = 0; s < board[i].length; s++) {
				if (board[i][s] == false)
					n1 = false;
			}
		}
		return n1;
	}

	static boolean moveRight(boolean[][] board, int x, int y, int ylength) {
		boolean n1 = false;
		for (int i = y; i < ylength; i++) {
			if (!board[x][i]) {
				n1 = true;
				break;
			}
		}
		return n1;
	}

	static boolean moveLeft(boolean[][] board, int x, int y, int ylength) {
		boolean n1 = false;
		for (int i = y; i >= 0; i--) {
			if (board[x][i] == false) {
				n1 = true;
				break;
			}
		}
		return n1;
	}

	static boolean workrow(boolean[][] board, int row) {
		boolean n1 = false;
		for (int i = 0; i < board[row].length; i++) {
			if (board[row][i] == false) {
				n1 = true;
				break;
			}
		}
		return n1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int xlength = in.nextInt();
		int ylength = in.nextInt();
		int xPos = in.nextInt() - 1;
		int yPos = in.nextInt() - 1;
		boolean[][] board = new boolean[xlength][ylength];
		board[xPos][yPos] = true;
		System.out.println((xPos + 1) + " " + (yPos + 1));
		printBoard(board);
		int row = 0;
		while (!entireBoard(board)) {
			if (moveRight(board, xPos, yPos, ylength)) {
				for (int i = yPos; i < ylength; i++) {
					if (!board[xPos][i]) {
						board[xPos][i] = true;
						System.out.println((xPos + 1) + " " + (i + 1));
						printBoard(board);
					}
					yPos = i;
				}
			}
			if (!moveRight(board, xPos, yPos, ylength) && workrow(board, xPos)) {
				if (moveLeft(board, xPos, yPos, ylength)) {
					for (int i = yPos; i >= 0; i--) {
						if (!board[xPos][i]) {
							board[xPos][i] = true;
							System.out.println((xPos + 1) + " " + (i + 1));
							printBoard(board);
						}
						yPos = i;
					}
				}
			}
			if (!workrow(board, xPos)) {
				if (workrow(board, row)) {
					xPos = row;
				} else {
					if (row < xlength) {
						row++;
					}
				}
			}
		}
	}
}
