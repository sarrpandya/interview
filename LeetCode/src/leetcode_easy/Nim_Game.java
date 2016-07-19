package leetcode_easy;

public class Nim_Game {
	
	public static boolean canWinNim(int n) {
	    return n%4>0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Nim_Game.canWinNim(3));
	}

}
