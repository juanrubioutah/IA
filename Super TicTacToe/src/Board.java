
public class Board {
	public boolean isComplete;
	public boolean isXWin;
	public boolean isTie;
	public String[] board;
	public Board() {
		board = new String[10];
		board[0] = "!";
		for(int i = 1; i<=9; i++) {
			board[i] = "-";
		}
	}

	public String get(int position) {
		try {
			return board[position];
		}catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	public boolean isTie() {
		if(!board[1].equals("-")&&!board[2].equals("-")&&!board[3].equals("-")&&!board[4].equals("-")&&!board[5].equals("-")&&!board[6].equals("-")&&!board[7].equals("-")&&!board[8].equals("-")&&!board[9].equals("-")) {
			if(!isComplete==true) {
				isComplete=true;
				isTie = true;
				markTie();
				return true;
			}
		}
		return false;
	}
	public void markTie() {
		for(int i = 1; i<=9; i++) {
			board[i] = "T";
			isComplete = true;
		}
	}
	public void markCompleted(boolean playerOneWin) {
		if(playerOneWin==true) {
			for(int i = 1; i<=9; i++) {
				board[i] = "X";
			}
			isComplete = true;
			isXWin = true;
			return;
		}
		else if(playerOneWin==false) {
			for(int i = 1; i<=9; i++) {
				board[i] = "O";
			}
			isComplete = true;
			isXWin = false;
			return;
		}
	}
	public void clear() {
		for(int i = 1; i<=9; i++) {
			board[i] = "-";
		}
	}
}
