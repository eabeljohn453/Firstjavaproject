package TicTacToeProject;
import java.util.Scanner;
class Borders {
	static char[][] board;
	int i, j;

	public Borders() {
		board = new char[3][3];
		border();
	}

	void border() {

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {
				board[i][j] = (' ');
			}
		}
	}

	void display() {
		System.out.println("----------");

		for (int i = 0; i < board.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "| ");
			}
			System.out.println();

			System.out.println("----------");
		}

	}

	static void placemark(int row, int column, char mark) {

		board[row][column] = mark;
	}

	Boolean checkcolwin() {
		for (j = 0; j < 3; j++) {
			if (board[0][0] != (' ') && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true;
			}
		}
		return false;

	}

	Boolean checkcolwinrow() {
		for (i = 0; i < 3; i++) {
			if (board[0][0] != (' ') && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;

	}
	Boolean checkcolwindia() {
		if(board[0][0] != (' ')&&board[0][2] != (' ')&&(board[0][0]==board[1][1]&&board[1][1]==board[2][2])||(board[0][2]==board[1][1]&&board[1][1]==board[2][0])) {
			return true;
			
		}
	return false;
	}

}

public class Border {
	public static void main(String[] args) {
		Borders A = new Borders();

		A.display();
		A.placemark(0, 0, 'x');
		A.placemark(1, 0, 'x');
		A.placemark(2, 0, 'x');
		A.placemark(0, 1, 'x');
		A.placemark(0, 2, 'x');
		A.placemark(1, 1, 'x');
		A.placemark(1, 2, 'x');
		A.display();
		System.out.println(A.checkcolwin());
		System.out.println(A.checkcolwinrow());
		System.out.println(A.checkcolwindia());
}

}   

class Humanplayer{
	String name;
	char mark;
	Humanplayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	void makemove() {
		int row;
		int column;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the row and column");
			row=sc.nextInt();
			column=sc.nextInt();
		}
		while(!isvalidmove(row,column));
		Borders.placemark(row, column, mark);
			
	}
		
		
	}
	boolean isvalidmove(int row,int column) {
		
		if(row>=0&&row<=2&&column>=0&&column<=2) {
			if(Borders.board[row][column]==' ') {
				return true;
			}
		}
	    
		     return false;
		
	    
	}
}