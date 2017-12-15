import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class ML {
	public static MLHelper helper;
	public static void init() {
		//Have the computer play against itself 1000 times. Determine if it is successful.
		try {
			helper = new MLHelper();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
		for(int i = 0; i<=1; i++) {
			play(10, 1);
			System.out.println("Printing Results:");
			Init.printBoard(Init.board1, Init.board1, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
			Init.board1 = new Board();
			Init.board2 = new Board();
			Init.board3 = new Board();
			Init.board4 = new Board();
			Init.board5 = new Board();
			Init.board6 = new Board();
			Init.board7 = new Board();
			Init.board8 = new Board();
			Init.board9 = new Board();
		}
		System.out.println("Performing Analysis...");
		try {
			Thread.sleep(1000);
		} catch(Exception g) {
			g.printStackTrace();
		}
		try {
			helper.performML();
		} catch (Exception h) {
			// TODO Auto-generated catch block
			h.printStackTrace();
		}
		
	}
	public static void play(int boardToPlayOn, int nextTurn) {
		Init.printBoard(Init.board1, Init.board1, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9);
		try {
			Thread.sleep(15);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
			System.out.println("Complete"); return;
		}
		if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
			System.out.println("TIE");
			return;
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
		if(nextTurn==1) {
			if(boardToPlayOn==1) {
				if(Init.board1.isComplete==false) {
					Random rndm = new Random();
					int randChoice = rndm.nextInt(9)+1;
					if(Init.board1.board[randChoice].equals("-")) {
						Init.board1.board[randChoice] = "X";
						if(PlayerManager.checkForSmallWin(Init.board1)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(1)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(2)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(3)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(4)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(5)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(6)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(7)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(8)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 2);
						}
						if(PlayerManager.checkForSmallTie(9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,2);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
					System.out.println("Saving Result Data");
					helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
					System.out.println("Complete"); return;
				}
				if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
					System.out.println("Saving Result Data");
					helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
					System.out.println("TIE");
					return;
				}
				Random rndm = new Random();
				int rand = rndm.nextInt(9)+1;
				if(rand<1||rand>9) {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
						System.out.println("TIE");
						return;
					}
					play(10, 1); //Try again
				}
				else {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(1)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(2)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(3)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(4)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(5)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(6)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(7)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(8)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10, 1);
						}
						if(PlayerManager.checkForSmallTie(9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							play(10,1);
						}
						if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("Complete"); return;
						}
						if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
							System.out.println("TIE");
							return;
						}
						else {
							System.out.println("Saving Result Data");
							helper.write(randChoice); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
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
					System.out.println("Saving Result Data");
					helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
					System.out.println("Complete"); return;
				}
				if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
					System.out.println("Saving Result Data");
					helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
					System.out.println("TIE");
					return;
				}
				Random rndm = new Random();
				int rand = rndm.nextInt(9)+1;
				if(rand<1||rand>9) {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
						System.out.println("TIE");
						return;
					}
					play(10, 2); //Try again
				}
				else {
					if(PlayerManager.checkForLargeWin(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true) {
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
						System.out.println("Complete"); return;
					}
					if(PlayerManager.checkForTie(Init.board1, Init.board2, Init.board3, Init.board4, Init.board5, Init.board6, Init.board7, Init.board8, Init.board9)==true){
						System.out.println("Saving Result Data");
						helper.write(1); try { Thread.sleep(10); } catch(Exception e) { e.printStackTrace();}
						System.out.println("TIE");
						return;
					}
					play(rand, 2);
				}
			}
		}
	}
}
