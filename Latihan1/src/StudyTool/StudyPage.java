package StudyTool;
import java.util.Scanner;
public class StudyPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanterm = new Scanner(System.in);
		String termvar;
		System.out.println("Enter a Study Term : ");
		termvar = scanterm.nextLine();
		Scanner scandef = new Scanner(System.in);
		String termdef;
		System.out.println("Enter a Definition : ");
		termdef = scandef.nextLine();
		
		System.out.println(termvar+" "+termdef);
	}

}
