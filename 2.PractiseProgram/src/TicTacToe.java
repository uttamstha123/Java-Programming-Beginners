import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[][] gameBoard = { 
				{ ' ', '|', ' ', '|', ' ' }, 
				{ '-', '+', ' ', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' },
				{ '-', '+', ' ', '+', '-' }, 
				{ ' ', '|', ' ', '|', ' ' } 
			};

		// Player turn
		gameBoard(gameBoard);
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the placement (1-9)");
			int playerTurn = sc.nextInt();
			startGame(gameBoard, playerTurn, "player");
			Random r = new Random();
			int cpuPos = r.nextInt(9) + 1;
			startGame(gameBoard,cpuPos,"cpu");
			gameBoard(gameBoard);
		}
	}

	public static void gameBoard(char[][] gameBoard) {

		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
//		for(int i = 0 ; i < gameBoard.length ; i++) {
//		for(int j = 0 ; j < gameBoard.length; j++) {
//			System.out.print(gameBoard[i][j]);
//		}
//		System.out.println();
	}

	public static void startGame(char[][] gameBoard, int playerPlace, String user) {
		char symbol = ' ';
		if (user.equalsIgnoreCase("player")) {
			symbol = 'X';
		} else if (user.equalsIgnoreCase("CPU")) {
			symbol = 'O';
		}
		switch (playerPlace) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		}
	}

}
