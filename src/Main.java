public class Main {

    public static void main(String[] args) {
		final int DESK_SIZE = 8;
		int[] deskRow = new int[DESK_SIZE];
		char[] deskColumn = new char[DESK_SIZE];
		String[][] desk = new String[DESK_SIZE][DESK_SIZE];

		for (int i=0; i<DESK_SIZE; i++){
			deskRow [i] = i+1;
	    	deskColumn[i] = (char)(i+65); //65 - code of 'A" char
			for (int j=0; j<DESK_SIZE; j++) {
				if (Math.floorMod(i+j,2)==0) {
					desk[i][j] = " |_| "; 		//white
				} else desk[i][j] = " |X| ";	//black
			}
		}
		for (int i=0; i<DESK_SIZE; i++) {
			System.out.print("\n" + deskRow[(DESK_SIZE - 1) - i] + " ");
			for (int j=0; j<DESK_SIZE; j++) {
				System.out.print(desk[i][j]);
			}
		}
		System.out.print("\n    ");
		for (char item : deskColumn) {
			System.out.print(item + "    ");
		}
    }
}