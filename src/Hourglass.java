

public class Hourglass {
	public static void main(String[] args) {
		DrawTopLine();
		DrawTop();
		//Middle();
		//DrawBottom();
		//DrawBottomLine();
		
	}
	
	//Produces the first line
	public static void DrawTopLine() {
		System.out.print("|");
		for (int i = 1; i <= 12; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}

	//Produces the top half
	public static void DrawTop() {
		for (int line = 1; line <= 12; line++) {
			System.out.print ("\\");
			for (int i = 1; i <= (line - 1); i++) {
				System.out.print (" ");
			}
		 for (int i=1; i <= (8-2 * line); i++) {
		 }
		}
	}
}

		 