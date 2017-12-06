import java.util.Random;

import net.sf.javaml.core.Instance;
import net.sf.javaml.tools.InstanceTools;

public class ML {
	public static void init() {
		//Have the computer play against itself 1000 times. Determine if it is successful.
		for(int i = 0; i<=1000; i++) {
			play(10, 1);
			System.out.println("Printing Results:");
			Init.printBoard(Init.board1, Init.board1, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
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
	public static void play(int boardToPlayOn, int nextTurn) {
		Init.printBoard(Init.board1, Init.board1, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(nextTurn==1) {
			if(boardToPlayOn==1) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==2) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==3) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==4) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==5) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==6) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==7) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==8) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==9) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 2);
						}
					}
					else {
						play(10, 1); //Try again
					}
				}
				else {
					play(10, 1); //Try again
				}
			}
			if(boardToPlayOn==10) {
				Random rndm = new Random();
				int rand = rndm.nextInt(9)+1;
				if(rand<1||rand>9) {
					play(10, 1); //Try again
				}
				else {
					boardToPlayOn = rand;
				}
			}
		}
		else if(nextTurn==2) {
			if(boardToPlayOn==1) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==2) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==3) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==4) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==5) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==6) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==7) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==8) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==9) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						else {
							play(PlayerManager.checkNextBoard(randChoice), 1);
						}
					}
					else {
						play(10, 2); //Try again
					}
				}
				else {
					play(10, 2); //Try again
				}
			}
			if(boardToPlayOn==10) {
				Random rndm = new Random();
				int rand = rndm.nextInt(9)+1;
				if(rand<1||rand>9) {
					play(10, 1); //Try again
				}
				else {
					boardToPlayOn = rand;
				}
			}
		}
	}
}
