import java.util.Scanner;

public class TicTacToe {
	
	char[][] board = new char[3][3];
	
	char player1 = 'X';
	char player2 = 'O';
	char currplayer = player1;
	

//	public static void main(String[] args) {
//		startGame();
//	}
	/** This starts the game */
	private void startGame() {
		char currplayer = player1;
		Scanner scan = new Scanner(System.in);
		int totalmoves = 0;
		while(!checkwin()) {
			if(totalmoves == 9) {
				System.out.println("The game is a tie!");
				break;
			}
			System.out.println("It is player " + currplayer + "'s turn. Please select a position to place a move:");
			printboard();
			int pos = scan.nextInt();
			move(currplayer, pos);
			totalmoves++;
			if(currplayer == 'X') currplayer = player2;
			else currplayer = player1;
		}
		scan.close();
		
	}
	
	public String getcurrplayer() {
		return "" + currplayer;
	}
	
	public void nextplayer() {
		if(currplayer == player1) currplayer = player2;
		else currplayer = player1;
	}

	public void printboard() {
		int count = 1;
		for(int r = 0; r < board.length; r++) {
			for(int c = 0; c < board[0].length; c++) {
				if(board[r][c] == '\0') System.out.print(count);
				else System.out.print(board[r][c]);
				count++;
				if(c == 0 || c == 1) System.out.print('|');
			}
			if(r == 0 || r == 1) System.out.println("\n-+-+-");
		}
		System.out.println("\n");
	}
	/**
	 * This method makes the given move of the given player
	 * @param player the player making the move
	 * @param pos the position of the desired move
	 */
	public void move(char player, int pos) {
		switch(pos) {
			case 1:
				board[0][0] = player;
				break;
			case 2:
				board[0][1] = player;
				break;
			case 3:
				board[0][2] = player;
				break;
			case 4:
				board[1][0] = player;
				break;
			case 5:
				board[1][1] = player;
				break;
			case 6:
				board[1][2] = player;
				break;
			case 7:
				board[2][0] = player;
				break;
			case 8:
				board[2][1] = player;
				break;
			case 9:
				board[2][2] = player;
				break;
		}
		
	}
	/**
	 * Checks if the game is won
	 */
	private boolean checkwin() {
		
		// check rows
		for(int r = 0; r < board.length; r++) {
			char mark = board[r][0];
			for(int c = 1; c < board[0].length; c++) {
				if(mark == '\0' || board[r][c] != mark) break;
				if(c == 2) { // game won
					System.out.println("Game won for player: " + mark);
					return true;
				}
			}
		}
		
		// check cols
		for(int c = 0; c < board.length; c++) {
			char mark = board[0][c];
			for(int r = 1; r < board.length; r++) {
				if(mark == '\0' || board[r][c] != mark) break;
				if(r == 2) { // game won
					System.out.println("Game won for player: " + mark);
					return true;
				}
			}
		}
		
		//check diags
		if(board[1][1] != '\0' && (board[0][0] == board[1][1] && board[1][1] == board[2][2]) ) {
			System.out.println("Game won for player: " + board[1][1]);
			return true;
		}
		if(board[1][1] != '\0' && (board[0][2] == board[1][1] && board[1][1] == board[2][0]) ) {
			System.out.println("Game won for player: " + board[1][1]);
			return true;
		}
		return false;
	}
}
