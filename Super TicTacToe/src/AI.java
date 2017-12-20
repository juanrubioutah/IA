import java.util.Random;

public class AI {
	public static int difficulty;
	public AI(int difficulty) { //difficulty is 1 for easy, and 2 for hard
		this.difficulty = difficulty;
	}
	public static void play(int boardToPlayOn) throws Exception {
		int nextPlay = 1;
		if(difficulty==1) { //easy mode
			if(boardToPlayOn == 10) { //randomly pick a board
				Random rndm = new Random();
				int rndmBoard = rndm.nextInt(10);
				if(rndmBoard<1||rndmBoard>9) {
					play(boardToPlayOn);
				}
				if(rndmBoard==1) {
					if(Init.board1.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board1.get(brdChoice).equals("-")) {
								Init.board1.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board1)==true) {
									Init.board1.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board1.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==2) {
					if(Init.board2.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board2.get(brdChoice).equals("-")) {
								Init.board2.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board2)==true) {
									Init.board2.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board2.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==3) {
					if(Init.board3.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board3.get(brdChoice).equals("-")) {
								Init.board3.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board3)==true) {
									Init.board3.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board3.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==4) {
					if(Init.board4.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board4.get(brdChoice).equals("-")) {
								Init.board4.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board4)==true) {
									Init.board4.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board4.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==5) {
					if(Init.board5.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board5.get(brdChoice).equals("-")) {
								Init.board5.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board5)==true) {
									Init.board5.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board5.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==6) {
					if(Init.board6.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board6.get(brdChoice).equals("-")) {
								Init.board6.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board6)==true) {
									Init.board6.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board6.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==7) {
					if(Init.board7.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board7.get(brdChoice).equals("-")) {
								Init.board7.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board7)==true) {
									Init.board7.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board7.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==8) {
					if(Init.board8.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board8.get(brdChoice).equals("-")) {
								Init.board8.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board8)==true) {
									Init.board8.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board8.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==9) {
					if(Init.board9.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board9.get(brdChoice).equals("-")) {
								Init.board9.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board9)==true) {
									Init.board9.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board9.isComplete==true) {
						play(boardToPlayOn);
					}
				}
			}
			else {
				int rndmBoard = boardToPlayOn;
				if(rndmBoard==1) {
					if(Init.board1.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board1.get(brdChoice).equals("-")) {
								Init.board1.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board1)==true) {
									Init.board1.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board1.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==2) {
					if(Init.board2.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board2.get(brdChoice).equals("-")) {
								Init.board2.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board2)==true) {
									Init.board2.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board2.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==3) {
					if(Init.board3.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board3.get(brdChoice).equals("-")) {
								Init.board3.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board3)==true) {
									Init.board3.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board3.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==4) {
					if(Init.board4.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board4.get(brdChoice).equals("-")) {
								Init.board4.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board4)==true) {
									Init.board4.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board4.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==5) {
					if(Init.board5.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board5.get(brdChoice).equals("-")) {
								Init.board5.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board5)==true) {
									Init.board5.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board5.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==6) {
					if(Init.board6.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board6.get(brdChoice).equals("-")) {
								Init.board6.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board6)==true) {
									Init.board6.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board6.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==7) {
					if(Init.board7.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board7.get(brdChoice).equals("-")) {
								Init.board7.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board7)==true) {
									Init.board7.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board7.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==8) {
					if(Init.board8.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board8.get(brdChoice).equals("-")) {
								Init.board8.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board8)==true) {
									Init.board8.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board8.isComplete==true) {
						play(boardToPlayOn);
					}
				}
				if(rndmBoard==9) {
					if(Init.board9.isComplete==false) {
						do {
							Random board = new Random();
							int brdChoice = board.nextInt(10);
							if(Init.board9.get(brdChoice).equals("-")) {
								Init.board9.board[brdChoice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board9)==true) {
									Init.board9.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(brdChoice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								continue;
							}
						}while(true);
					}
					else if(Init.board9.isComplete==true) {
						play(boardToPlayOn);
					}
				}
			}
			
		}
		else if(difficulty==2) { //hard mode
			/* this is where things start to get fun. The AI will use one of two strategies:
			 * In strategy 1, the AI will attempt to have the player only play in boards 6, 8, and 9, while picking random spaces in any cases where it cannot send the player to these boards
			 * In strategy 2, the AI will use machine learning to make the best possible choices based on experience
			 */
			int mode = 2;
			if(mode==1) {
				if(boardToPlayOn==0) {
					Random rndm = new Random();
					int rand = rndm.nextInt(6) +1;
					if(rand==6) {
						play(0);
					}
					else {
						boardToPlayOn = rand;
					}
				}
				if(boardToPlayOn==1) {
					if(Init.board1.isComplete==false) {
						if(Init.board1.get(6).equals("-")) {
							Init.board1.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board1)==true) {
								Init.board1.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board1.get(8).equals("-")) {
							Init.board1.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board1)==true) {
								Init.board1.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board1.get(9).equals("-")) {
							Init.board1.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board1)==true) {
								Init.board1.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board1.get(choice).equals("-")) {
								Init.board1.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board1)==true) {
									Init.board1.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==2) {
					if(Init.board2.isComplete==false) {
						if(Init.board2.get(6).equals("-")) {
							Init.board2.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board2)==true) {
								Init.board2.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board2.get(8).equals("-")) {
							Init.board2.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board2)==true) {
								Init.board2.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board2.get(9).equals("-")) {
							Init.board2.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board2)==true) {
								Init.board2.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board2.get(choice).equals("-")) {
								Init.board2.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board2)==true) {
									Init.board2.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==3) {
					if(Init.board3.isComplete==false) {
						if(Init.board3.get(6).equals("-")) {
							Init.board3.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board3)==true) {
								Init.board3.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board3.get(8).equals("-")) {
							Init.board3.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board3)==true) {
								Init.board3.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board3.get(9).equals("-")) {
							Init.board3.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board3)==true) {
								Init.board3.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board3.get(choice).equals("-")) {
								Init.board3.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board3)==true) {
									Init.board3.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==4) {
					if(Init.board4.isComplete==false) {
						if(Init.board4.get(6).equals("-")) {
							Init.board4.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board4)==true) {
								Init.board4.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board4.get(8).equals("-")) {
							Init.board4.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board4)==true) {
								Init.board4.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board4.get(9).equals("-")) {
							Init.board4.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board4)==true) {
								Init.board4.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board4.get(choice).equals("-")) {
								Init.board4.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board4)==true) {
									Init.board4.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==5) {
					if(Init.board5.isComplete==false) {
						if(Init.board5.get(6).equals("-")) {
							Init.board5.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board5)==true) {
								Init.board5.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board5.get(8).equals("-")) {
							Init.board5.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board5)==true) {
								Init.board5.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board5.get(9).equals("-")) {
							Init.board5.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board5)==true) {
								Init.board5.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board5.get(choice).equals("-")) {
								Init.board5.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board5)==true) {
									Init.board5.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==6) {
					if(Init.board6.isComplete==false) {
						if(Init.board6.get(6).equals("-")) {
							Init.board6.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board6)==true) {
								Init.board6.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board6.get(8).equals("-")) {
							Init.board6.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board6)==true) {
								Init.board6.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board6.get(9).equals("-")) {
							Init.board6.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board6)==true) {
								Init.board6.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board6.get(choice).equals("-")) {
								Init.board6.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board6)==true) {
									Init.board6.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==7) {
					if(Init.board7.isComplete==false) {
						if(Init.board7.get(6).equals("-")) {
							Init.board7.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board7)==true) {
								Init.board7.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board7.get(8).equals("-")) {
							Init.board7.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board7)==true) {
								Init.board7.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board7.get(9).equals("-")) {
							Init.board7.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board7)==true) {
								Init.board7.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board7.get(choice).equals("-")) {
								Init.board7.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board7)==true) {
									Init.board7.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==8) {
					if(Init.board8.isComplete==false) {
						if(Init.board8.get(6).equals("-")) {
							Init.board8.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board8)==true) {
								Init.board8.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(6);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board8.get(8).equals("-")) {
							Init.board8.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board8)==true) {
								Init.board8.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(8);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board8.get(9).equals("-")) {
							Init.board8.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board8)==true) {
								Init.board8.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board8.get(choice).equals("-")) {
								Init.board8.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board8)==true) {
									Init.board8.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(choice);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
				if(boardToPlayOn==9) {
					if(Init.board9.isComplete==false) {
						if(Init.board9.get(6).equals("-")) {
							Init.board9.board[6] = "O";
							if(PlayerManager.checkForSmallWin(Init.board9)==true) {
								Init.board9.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board9.get(8).equals("-")) {
							Init.board9.board[8] = "O";
							if(PlayerManager.checkForSmallWin(Init.board9)==true) {
								Init.board9.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else if(Init.board9.get(9).equals("-")) {
							Init.board9.board[9] = "O";
							if(PlayerManager.checkForSmallWin(Init.board9)==true) {
								Init.board9.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
								System.out.println("Win.");
								PlayerManager.clearBoards(); PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(9);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							Random rndm = new Random();
							int choice = rndm.nextInt(8) +1;
							if(Init.board9.get(choice).equals("-")) {
								Init.board9.board[choice] = "O";
								if(PlayerManager.checkForSmallWin(Init.board9)==true) {
									Init.board9.markCompleted(false);
									nextPlay = 10;
								}
								if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
									System.out.println("Win.");
									PlayerManager.clearBoards(); PlayerManager.play(10, true);
								}
								if(nextPlay!=10) {
									nextPlay = PlayerManager.checkNextBoard(9);
								}
								PlayerManager.play(nextPlay, true);
							}
							else {
								play(0);
							}
						}
					}
					else {
						play(0);
					}
				}
			}
			else if(mode==2) {
				System.out.println("Machine Learning Computing...");
				if(boardToPlayOn==1) {
					if(Init.board1.board[MLHelper.play()].equals("-")) {
						Init.board1.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true){
							Init.board1.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board1.board[choice].equals("-")) {
							Init.board1.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board1)==true){
								Init.board1.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==2) {
					if(Init.board2.board[MLHelper.play()].equals("-")) {
						Init.board2.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board2)==true){
							Init.board2.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board2.board[choice].equals("-")) {
							Init.board2.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board2)==true){
								Init.board2.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==3) {
					if(Init.board3.board[MLHelper.play()].equals("-")) {
						Init.board3.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board3)==true){
							Init.board3.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board3.board[choice].equals("-")) {
							Init.board3.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board3)==true){
								Init.board3.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==4) {
					if(Init.board4.board[MLHelper.play()].equals("-")) {
						Init.board4.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board4)==true){
							Init.board4.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board4.board[choice].equals("-")) {
							Init.board4.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board4)==true){
								Init.board4.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==5) {
					if(Init.board5.board[MLHelper.play()].equals("-")) {
						Init.board5.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board5)==true){
							Init.board5.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board5.board[choice].equals("-")) {
							Init.board5.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board5)==true){
								Init.board5.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==6) {
					if(Init.board6.board[MLHelper.play()].equals("-")) {
						Init.board6.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board6)==true){
							Init.board6.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board6.board[choice].equals("-")) {
							Init.board6.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board6)==true){
								Init.board6.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==7) {
					if(Init.board7.board[MLHelper.play()].equals("-")) {
						Init.board7.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board7)==true){
							Init.board7.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board7.board[choice].equals("-")) {
							Init.board7.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board7)==true){
								Init.board7.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==8) {
					if(Init.board8.board[MLHelper.play()].equals("-")) {
						Init.board8.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board8)==true){
							Init.board8.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board8.board[choice].equals("-")) {
							Init.board8.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board8)==true){
								Init.board8.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==9) {
					if(Init.board9.board[MLHelper.play()].equals("-")) {
						Init.board9.board[MLHelper.play()] = "O";
						if(PlayerManager.checkForSmallWin(Init.board9)==true){
							Init.board9.markCompleted(false);
							nextPlay = 10;
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Win.");
							PlayerManager.clearBoards();
							PlayerManager.play(10, true);
						}
						if(nextPlay!=10) {
							nextPlay = PlayerManager.checkNextBoard(MLHelper.play());
						}
						PlayerManager.play(nextPlay, true);
					}
					else {
						Random rndm = new Random();
						int choice = rndm.nextInt(9)+1;
						if(Init.board9.board[choice].equals("-")) {
							Init.board9.board[choice] = "O";
							if(PlayerManager.checkForSmallWin(Init.board9)==true){
								Init.board9.markCompleted(false);
								nextPlay = 10;
							}
							if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
								System.out.println("Win.");
								PlayerManager.clearBoards();
								PlayerManager.play(10, true);
							}
							if(nextPlay!=10) {
								nextPlay = PlayerManager.checkNextBoard(choice);
							}
							PlayerManager.play(nextPlay, true);
						}
						else {
							play(boardToPlayOn);
						}
					}
				}
				if(boardToPlayOn==10) {
					Random rndm = new Random();
					int choice = rndm.nextInt(9)+1;
					if(choice==1) {
						if(!Init.board1.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==2) {
						if(!Init.board2.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==3) {
						if(!Init.board3.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==4) {
						if(!Init.board4.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==5) {
						if(!Init.board5.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==6) {
						if(!Init.board6.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==7) {
						if(!Init.board7.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==8) {
						if(!Init.board8.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
					if(choice==9) {
						if(!Init.board9.isComplete) {
							play(choice);
						}
						else {
							play(10);
						}
					}
				}
				
			}
		}
	}
}
