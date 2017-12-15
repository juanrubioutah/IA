import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AIHelper {
	public static PrintWriter printWriter;
	
	public AIHelper() throws UnsupportedEncodingException, FileNotFoundException{
		printWriter = new PrintWriter("AIData.arff", "UTF-8");
		printWriter.println("@relation tictactoe\n");
		printWriter.println("@attribute space1 {-, X, O, T}");
		printWriter.println("@attribute space2 {-, X, O, T}");
		printWriter.println("@attribute space3 {-, X, O, T}");
		printWriter.println("@attribute space4 {-, X, O, T}");
		printWriter.println("@attribute space5 {-, X, O, T}");
		printWriter.println("@attribute space6 {-, X, O, T}");
		printWriter.println("@attribute space7 {-, X, O, T}");
		printWriter.println("@attribute space8 {-, X, O, T}");
		printWriter.println("@attribute space9 {-, X, O, T}");
		printWriter.println("@attribute space10 {-, X, O, T}");
		printWriter.println("@attribute space11 {-, X, O, T}");
		printWriter.println("@attribute space12 {-, X, O, T}");
		printWriter.println("@attribute space13 {-, X, O, T}");
		printWriter.println("@attribute space14 {-, X, O, T}");
		printWriter.println("@attribute space15 {-, X, O, T}");
		printWriter.println("@attribute space16 {-, X, O, T}");
		printWriter.println("@attribute space17 {-, X, O, T}");
		printWriter.println("@attribute space18 {-, X, O, T}");
		printWriter.println("@attribute space19 {-, X, O, T}");
		printWriter.println("@attribute space20 {-, X, O, T}");
		printWriter.println("@attribute space21 {-, X, O, T}");
		printWriter.println("@attribute space22 {-, X, O, T}");
		printWriter.println("@attribute space23 {-, X, O, T}");
		printWriter.println("@attribute space24 {-, X, O, T}");
		printWriter.println("@attribute space25 {-, X, O, T}");
		printWriter.println("@attribute space26 {-, X, O, T}");
		printWriter.println("@attribute space27 {-, X, O, T}");
		printWriter.println("@attribute space28 {-, X, O, T}");
		printWriter.println("@attribute space29 {-, X, O, T}");
		printWriter.println("@attribute space30 {-, X, O, T}");
		printWriter.println("@attribute space31 {-, X, O, T}");
		printWriter.println("@attribute space32 {-, X, O, T}");
		printWriter.println("@attribute space33 {-, X, O, T}");
		printWriter.println("@attribute space34 {-, X, O, T}");
		printWriter.println("@attribute space35 {-, X, O, T}");
		printWriter.println("@attribute space36 {-, X, O, T}");
		printWriter.println("@attribute space37 {-, X, O, T}");
		printWriter.println("@attribute space38 {-, X, O, T}");
		printWriter.println("@attribute space39 {-, X, O, T}");
		printWriter.println("@attribute space40 {-, X, O, T}");
		printWriter.println("@attribute space41 {-, X, O, T}");
		printWriter.println("@attribute space42 {-, X, O, T}");
		printWriter.println("@attribute space43 {-, X, O, T}");
		printWriter.println("@attribute space44 {-, X, O, T}");
		printWriter.println("@attribute space45 {-, X, O, T}");
		printWriter.println("@attribute space46 {-, X, O, T}");
		printWriter.println("@attribute space47 {-, X, O, T}");
		printWriter.println("@attribute space48 {-, X, O, T}");
		printWriter.println("@attribute space49 {-, X, O, T}");
		printWriter.println("@attribute space50 {-, X, O, T}");
		printWriter.println("@attribute space51 {-, X, O, T}");
		printWriter.println("@attribute space52 {-, X, O, T}");
		printWriter.println("@attribute space53 {-, X, O, T}");
		printWriter.println("@attribute space54 {-, X, O, T}");
		printWriter.println("@attribute space55 {-, X, O, T}");
		printWriter.println("@attribute space56 {-, X, O, T}");
		printWriter.println("@attribute space57 {-, X, O, T}");
		printWriter.println("@attribute space58 {-, X, O, T}");
		printWriter.println("@attribute space59 {-, X, O, T}");
		printWriter.println("@attribute space60 {-, X, O, T}");
		printWriter.println("@attribute space61 {-, X, O, T}");
		printWriter.println("@attribute space62 {-, X, O, T}");
		printWriter.println("@attribute space63 {-, X, O, T}");
		printWriter.println("@attribute space64 {-, X, O, T}");
		printWriter.println("@attribute space65 {-, X, O, T}");
		printWriter.println("@attribute space66 {-, X, O, T}");
		printWriter.println("@attribute space67 {-, X, O, T}");
		printWriter.println("@attribute space68 {-, X, O, T}");
		printWriter.println("@attribute space69 {-, X, O, T}");
		printWriter.println("@attribute space70 {-, X, O, T}");
		printWriter.println("@attribute space71 {-, X, O, T}");
		printWriter.println("@attribute space72 {-, X, O, T}");
		printWriter.println("@attribute space73 {-, X, O, T}");
		printWriter.println("@attribute space74 {-, X, O, T}");
		printWriter.println("@attribute space75 {-, X, O, T}");
		printWriter.println("@attribute space76 {-, X, O, T}");
		printWriter.println("@attribute space77 {-, X, O, T}");
		printWriter.println("@attribute space78 {-, X, O, T}");
		printWriter.println("@attribute space79 {-, X, O, T}");
		printWriter.println("@attribute space80 {-, X, O, T}");
		printWriter.println("@attribute space81 {-, X, O, T}");
		printWriter.println("@attribute nextSpace {1, 2, 3, 4, 5, 6, 7, 8, 9}\n");
		printWriter.println("@data");
		printWriter.flush();
	}
	public static void write() {
		printWriter.print(Init.board1.board[1]+","+Init.board1.board[2]+","+Init.board1.board[3]+","+Init.board1.board[4]+","+Init.board1.board[5]+","+Init.board1.board[6]+","+Init.board1.board[7]+","+Init.board1.board[8]+","+Init.board1.board[9]+",");
		printWriter.print(Init.board2.board[1]+","+Init.board2.board[2]+","+Init.board2.board[3]+","+Init.board2.board[4]+","+Init.board2.board[5]+","+Init.board2.board[6]+","+Init.board2.board[7]+","+Init.board2.board[8]+","+Init.board2.board[9]+",");
		printWriter.print(Init.board3.board[1]+","+Init.board3.board[2]+","+Init.board3.board[3]+","+Init.board3.board[4]+","+Init.board3.board[5]+","+Init.board3.board[6]+","+Init.board3.board[7]+","+Init.board3.board[8]+","+Init.board3.board[9]+",");
		printWriter.print(Init.board4.board[1]+","+Init.board4.board[2]+","+Init.board4.board[3]+","+Init.board4.board[4]+","+Init.board4.board[5]+","+Init.board4.board[6]+","+Init.board4.board[7]+","+Init.board3.board[8]+","+Init.board4.board[9]+",");
		printWriter.print(Init.board5.board[1]+","+Init.board5.board[2]+","+Init.board5.board[3]+","+Init.board5.board[4]+","+Init.board5.board[5]+","+Init.board5.board[6]+","+Init.board5.board[7]+","+Init.board5.board[8]+","+Init.board5.board[9]+",");
		printWriter.print(Init.board6.board[1]+","+Init.board6.board[2]+","+Init.board6.board[3]+","+Init.board6.board[4]+","+Init.board6.board[5]+","+Init.board6.board[6]+","+Init.board6.board[7]+","+Init.board6.board[8]+","+Init.board6.board[9]+",");
		printWriter.print(Init.board7.board[1]+","+Init.board7.board[2]+","+Init.board7.board[3]+","+Init.board7.board[4]+","+Init.board7.board[5]+","+Init.board7.board[6]+","+Init.board7.board[7]+","+Init.board7.board[8]+","+Init.board7.board[9]+",");
		printWriter.print(Init.board8.board[1]+","+Init.board8.board[2]+","+Init.board8.board[3]+","+Init.board8.board[4]+","+Init.board8.board[5]+","+Init.board8.board[6]+","+Init.board8.board[7]+","+Init.board8.board[8]+","+Init.board8.board[9]+",");
		printWriter.println(Init.board9.board[1]+","+Init.board9.board[2]+","+Init.board9.board[3]+","+Init.board9.board[4]+","+Init.board9.board[5]+","+Init.board9.board[6]+","+Init.board9.board[7]+","+Init.board9.board[8]+","+Init.board9.board[9]+",?");
		printWriter.flush();
	}
	public static int evaluate() {
		
	}
}
