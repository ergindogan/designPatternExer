package tr.com.dp;


public class Singleton {
	
	private static Singleton _instance;
	
	
	public static Singleton INSTANCE(){
		if(_instance == null){
			_instance = new Singleton();
		}
		return _instance;
	}
	
	private Singleton(){
		
	}
	
	public void myPublicMethod(){
		System.out.println("This is public!");
	}
}
