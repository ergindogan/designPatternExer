package tr.com.dp.window;

public class PMWindow extends Window {

	public void clientCannotUser(){
		System.out.println("You shall not pass!");
		classSpecificMethod();
	}
	
	private void classSpecificMethod(){
		System.out.println("This is class specific!");
	}
	
}
