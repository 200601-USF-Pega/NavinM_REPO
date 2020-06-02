import com.revature.tourofheroes.menu.MainMenu;

public class Driver {
//Class scope
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword allocates space
		
		//String newString = "a";
		//newString = "b";
		//String newString2 = new String("a");
		//String newString3 = "a";
		//System.out.println(newString == newString3);
		//System.out.println(newString == newString2);
		//kSystem.out.println(newString.equals(newString2));

		MainMenu menu = new MainMenu();
		menu.mainMenu();
	}

}
