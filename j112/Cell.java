
public class Cell {
	public int row;
	public int col;
	public String toString() {
		return "row col";
	}
	public boolean equals(int row,int col) {
		if(row==col) return true;
		else return false;
	}
}
