import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class PlayerManager {
	public static boolean isPlayingAlone;
	public static AI ai;
	public PlayerManager(boolean isPlayingAlone) {
		this.isPlayingAlone = isPlayingAlone;
	}
	public static void play(int board, boolean playerOneTurn) throws FileNotFoundException, UnsupportedEncodingException { //Return a result of which board the next turn will be on. Returns 10 if any board is playable.
		ai = new AI(2);
		String playCharacter = "-";
		Init.printBoard(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
		if(playerOneTurn==true) {
			playCharacter = "X";
			System.out.println("Player One Turn");
			if(board==10) {
				System.out.println("Choose a board to play on. Type a number 1-9.");
				Scanner boardReader = new Scanner(System.in);
				try {
					board = boardReader.nextInt();
				}catch(Exception e) {
					System.out.println("Didn't recognize input. Trying again...");
					play(board, playerOneTurn);
				}
			}
			System.out.println("Playing on board "+board);
			System.out.println("Choose a space. 1-9.");
			Scanner spaceReader = new Scanner(System.in);
			int chosenSpace = 0;
			try {
				chosenSpace = spaceReader.nextInt();
			}catch(Exception e) {
				System.out.println("Didn't recognize input. Trying again...");
				play(board, playerOneTurn);
			}
			if(checkOpenSpace(board, chosenSpace)==true) {
				if(board==1) {
					Init.board1.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board1)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==2) {
					Init.board2.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board2)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==3) {
					Init.board3.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board3)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==4) {
					Init.board4.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board4)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==5) {
					Init.board5.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board5)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==6) {
					Init.board6.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board6)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==7) {
					Init.board7.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board7)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==8) {
					Init.board8.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board8)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
				}
				if(board==9) {
					Init.board9.board[chosenSpace] = "X";
					//Init.helper.write(chosenSpace);
					MLHelper.writeLastMove();
					if(checkForSmallWin(Init.board9)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = false;
					play(board, playerOneTurn);
					
				}
			}
			else if(checkOpenSpace(board, chosenSpace)==false) {
				System.out.println("That space is not available. Trying again...");
				play(board, playerOneTurn);
			}
		}
		else if(playerOneTurn==false) {
			if(isPlayingAlone==true) {
				try {
					ai.play(board);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				playerOneTurn = true;
			}
			playCharacter = "O";
			System.out.println("Player Two Turn");
			if(board==10) {
				System.out.println("Choose a board to play on. Type a number 1-9.");
				Scanner boardReader = new Scanner(System.in);
				try {
					board = boardReader.nextInt();
				}catch(Exception e) {
					System.out.println("Didn't recognize input. Trying again...");
					play(board, playerOneTurn);
				}
			}
			System.out.println("Playing on board "+board);
			System.out.println("Choose a space. 1-9.");
			Scanner spaceReader = new Scanner(System.in);
			int chosenSpace = 0;
			try {
				chosenSpace = spaceReader.nextInt();
			}catch(Exception e) {
				System.out.println("Didn't recognize input. Trying again...");
				play(board, playerOneTurn);
			}
			if(checkOpenSpace(board, chosenSpace)==true) {
				if(board==1) {
					Init.board1.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board1)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==2) {
					Init.board2.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board2)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==3) {
					Init.board3.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board3)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==4) {
					Init.board4.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board4)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==5) {
					Init.board5.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board5)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==6) {
					Init.board6.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board6)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==7) {
					Init.board7.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board7)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==8) {
					Init.board8.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board8)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
				if(board==9) {
					Init.board9.board[chosenSpace] = "O";
					if(checkForSmallWin(Init.board9)==true){
						board = 10;
					}
					checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
					if(board!=10) {
						board = checkNextBoard(chosenSpace);
					}
					playerOneTurn = true;
					play(board, playerOneTurn);
				}
			}
			else if(checkOpenSpace(board, chosenSpace)==false) {
				System.out.println("That space is not available. Trying again...");
				play(board, playerOneTurn);
			}
		}
		
	}
	public static boolean checkForSmallWin(Board board) { //Return true if the current play wins on the small board
		if(board.get(1).equals(board.get(2))&&board.get(2).equals(board.get(3))) {
			if(board.get(1).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(1).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		if(board.get(4).equals(board.get(5))&&board.get(5).equals(board.get(6))) {
			if(board.get(4).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(4).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		if(board.get(7).equals(board.get(8))&&board.get(8).equals(board.get(9))) {
			if(board.get(7).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(7).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		if(board.get(1).equals(board.get(4))&&board.get(4).equals(board.get(7))) {
			if(board.get(1).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(1).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		if(board.get(2).equals(board.get(5))&&board.get(5).equals(board.get(8))) {
			if(board.get(2).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(2).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		if(board.get(3).equals(board.get(6))&&board.get(6).equals(board.get(9))) {
			if(board.get(3).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(3).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		if(board.get(1).equals(board.get(5))&&board.get(5).equals(board.get(9))) {
			if(board.get(1).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(1).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		if(board.get(3).equals(board.get(5))&&board.get(5).equals(board.get(7))) {
			if(board.get(3).equals("X")) {
				board.markCompleted(true);
				return true;
			}
			else if(board.get(3).equals("O")) {
				board.markCompleted(false);
				return true;
			}
		}
		return false;
	}
	public static boolean checkForLargeWin(Board board1, Board board2, Board board3, Board board4, Board board5, Board board6, Board board7, Board board8, Board board9) { //returns true if the current play wins on the large board
		if(board1.isXWin&&board2.isXWin&&board3.isXWin) {
			return true;
		}
		else if(board1.isXWin==false) {
			if(board1.isComplete) {
				if(board2.isComplete&&(board2.isXWin==false)) {
					if(board3.isComplete&&(board3.isXWin==false)) {
						return true;
					}
				}
			}
		}
		if(board4.isXWin&&board5.isXWin&&board6.isXWin) {
			return true;
		}
		else if(board4.isXWin==false) {
			if(board4.isComplete) {
				if(board5.isComplete&&(board5.isXWin==false)) {
					if(board6.isComplete&&(board6.isXWin==false)) {
						return true;
					}
				}
			}
		}
		if(board7.isXWin&&board8.isXWin&&board9.isXWin) {
			return true;
		}
		else if(board7.isXWin==false) {
			if(board7.isComplete) {
				if(board8.isComplete&&(board8.isXWin==false)) {
					if(board9.isComplete&&(board9.isXWin==false)) {
						return true;
					}
				}
			}
		}
		if(board1.isXWin&&board4.isXWin&&board7.isXWin) {
			return true;
		}
		else if(board1.isXWin==false) {
			if(board1.isComplete) {
				if(board4.isComplete&&(board4.isXWin==false)) {
					if(board7.isComplete&&(board7.isXWin==false)) {
						return true;
					}
				}
			}
		}
		if(board2.isXWin&&board5.isXWin&&board8.isXWin) {
			return true;
		}
		else if(board2.isXWin==false) {
			if(board2.isComplete) {
				if(board5.isComplete&&(board5.isXWin==false)) {
					if(board8.isComplete&&(board8.isXWin==false)) {
						return true;
					}
				}
			}
		}
		if(board3.isXWin&&board6.isXWin&&board9.isXWin) {
			return true;
		}
		else if(board3.isXWin==false) {
			if(board3.isComplete) {
				if(board6.isComplete&&(board6.isXWin==false)) {
					if(board9.isComplete&&(board9.isXWin==false)) {
						return true;
					}
				}
			}
		}
		if(board1.isXWin&&board5.isXWin&&board9.isXWin) {
			return true;
		}
		else if(board1.isXWin==false) {
			if(board1.isComplete) {
				if(board5.isComplete&&(board5.isXWin==false)) {
					if(board9.isComplete&&(board9.isXWin==false)) {
						return true;
					}
				}
			}
		}
		if(board3.isXWin&&board5.isXWin&&board7.isXWin) {
			return true;
		}
		else if(board3.isXWin==false) {
			if(board3.isComplete) {
				if(board5.isComplete&&(board5.isXWin==false)) {
					if(board7.isComplete&&(board7.isXWin==false)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean checkOpenSpace(int board, int space) { //return true if a space is available for taking, return false if it's not
		if(board==1) {
			if(Init.board1.get(space).equals("-")) {
				return true;
			}
		}
		if(board==2) {
			if(Init.board2.get(space).equals("-")) {
				return true;
			}
		}
		if(board==3) {
			if(Init.board3.get(space).equals("-")) {
				return true;
			}
		}
		if(board==4) {
			if(Init.board4.get(space).equals("-")) {
				return true;
			}
		}
		if(board==5) {
			if(Init.board5.get(space).equals("-")) {
				return true;
			}
		}
		if(board==6) {
			if(Init.board6.get(space).equals("-")) {
				return true;
			}
		}
		if(board==7) {
			if(Init.board7.get(space).equals("-")) {
				return true;
			}
		}
		if(board==8) {
			if(Init.board8.get(space).equals("-")) {
				return true;
			}
		}
		if(board==9) {
			if(Init.board9.get(space).equals("-")) {
				return true;
			}
		}
		return false;
	}
	public static int checkNextBoard(int chosenSpace) { //determines which board the next play will be on based on the current play
		//TODO: check first for the completion of the current board, then for the next board
		if(chosenSpace == 1) {
			if(Init.board1.isComplete==false) {
				return 1;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 2) {
			if(Init.board2.isComplete==false) {
				return 2;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 3) {
			if(Init.board3.isComplete==false) {
				return 3;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 4) {
			if(Init.board4.isComplete==false) {
				return 4;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 5) {
			if(Init.board5.isComplete==false) {
				return 5;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 6) {
			if(Init.board6.isComplete==false) {
				return 6;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 7) {
			if(Init.board7.isComplete==false) {
				return 7;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 8) {
			if(Init.board8.isComplete==false) {
				return 8;
			}
			else {
				return 10;
			}
		}
		if(chosenSpace == 9) {
			if(Init.board9.isComplete==false) {
				return 9;
			}
			else {
				return 10;
			}
		}
		return -1; //error case
	}
	public static boolean checkForSmallTie(int boardNum) {
		if(boardNum==1) {
			if(Init.board1.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==2) {
			if(Init.board2.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==3) {
			if(Init.board3.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==4) {
			if(Init.board4.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==5) {
			if(Init.board5.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==6) {
			if(Init.board6.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==7) {
			if(Init.board7.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==8) {
			if(Init.board8.isTie()==true){
				return true;
			}
			return false;
		}
		if(boardNum==9) {
			if(Init.board9.isTie()==true){
				return true;
			}
			return false;
		}
		return false;
	}
	public static boolean checkForTie(Board board1, Board board2, Board board3, Board board4, Board board5, Board board6, Board board7, Board board8, Board board9) {
		if(board1.isComplete&&board2.isComplete&&board3.isComplete&&board4.isComplete&&board5.isComplete&&board6.isComplete&&board7.isComplete&&board8.isComplete&&board9.isComplete) {
			if(checkForLargeWin(board1, board2, board3, board4, board5, board6, board7, board8, board9)==false) {
				return true;
			}
			
		}
		return false;
	}
	public static void clearBoards() {
		Init.board1.clear();
		Init.board2.clear();
		Init.board3.clear();
		Init.board4.clear();
		Init.board5.clear();
		Init.board6.clear();
		Init.board7.clear();
		Init.board8.clear();
		Init.board9.clear();
	}
}
