
public class Board {
	public boolean isComplete;
	public boolean isXWin;
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
