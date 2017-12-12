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
			Thread.sleep(10);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		PlayerManager.checkForSmallWin(Init.board1);
		PlayerManager.checkForSmallWin(Init.board2);
		PlayerManager.checkForSmallWin(Init.board3);
		PlayerManager.checkForSmallWin(Init.board4);
		PlayerManager.checkForSmallWin(Init.board5);
		PlayerManager.checkForSmallWin(Init.board6);
		PlayerManager.checkForSmallWin(Init.board7);
		PlayerManager.checkForSmallWin(Init.board8);
		PlayerManager.checkForSmallWin(Init.board9);
		PlayerManager.checkForSmallTie(1);
		PlayerManager.checkForSmallTie(2);
		PlayerManager.checkForSmallTie(3);
		PlayerManager.checkForSmallTie(4);
		PlayerManager.checkForSmallTie(5);
		PlayerManager.checkForSmallTie(6);
		PlayerManager.checkForSmallTie(7);
		PlayerManager.checkForSmallTie(8);
		PlayerManager.checkForSmallTie(9);
		if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
			System.out.println("Complete"); return;
		}
		if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
			System.out.println("TIE");
			return;
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
						if(PlayerManager.checkForSmallTie(1)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board2.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board2.board[randChoice].equals("-")) {
						Init.board2.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board2)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(2)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board3.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board3.board[randChoice].equals("-")) {
						Init.board3.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board3)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(3)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board4.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board4.board[randChoice].equals("-")) {
						Init.board4.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board4)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(4)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board5.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board5.board[randChoice].equals("-")) {
						Init.board5.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board5)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(5)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board6.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board6.board[randChoice].equals("-")) {
						Init.board6.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board6)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(6)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board7.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board7.board[randChoice].equals("-")) {
						Init.board7.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board7)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(7)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board8.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board8.board[randChoice].equals("-")) {
						Init.board8.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board8)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(8)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board9.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board9.board[randChoice].equals("-")) {
						Init.board9.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board9)==true) {
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(9)==true){
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
					System.out.println("Complete"); return;
				}
				if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
					System.out.println("TIE");
					return;
				}
				Random rndm = new Random();
				int rand = rndm.nextInt(9)+1;
				if(rand<1||rand>9) {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("TIE");
						return;
					}
					play(10, 1); //Try again
				}
				else {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("TIE");
						return;
					}
					play(rand, 1);
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
						if(PlayerManager.checkForSmallTie(1)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board2.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board2.board[randChoice].equals("-")) {
						Init.board2.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board2)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(2)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board3.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board3.board[randChoice].equals("-")) {
						Init.board3.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board3)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(3)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board4.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board4.board[randChoice].equals("-")) {
						Init.board4.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board4)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(4)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board5.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board5.board[randChoice].equals("-")) {
						Init.board5.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board5)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(5)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board6.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board6.board[randChoice].equals("-")) {
						Init.board6.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board6)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(6)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board7.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board7.board[randChoice].equals("-")) {
						Init.board7.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board7)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(7)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board8.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board8.board[randChoice].equals("-")) {
						Init.board8.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board8)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(8)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(Init.board9.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board9.board[randChoice].equals("-")) {
						Init.board9.board[randChoice] = "O";
						if(PlayerManager.checkForSmallWin(Init.board9)==true) {
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(9)==true){
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("TIE");
							return;
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
				if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
					System.out.println("Complete"); return;
				}
				if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
					System.out.println("TIE");
					return;
				}
				Random rndm = new Random();
				int rand = rndm.nextInt(9)+1;
				if(rand<1||rand>9) {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("TIE");
						return;
					}
					play(10, 2); //Try again
				}
				else {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("TIE");
						return;
					}
					play(rand, 2);
				}
			}
		}
	}
}
