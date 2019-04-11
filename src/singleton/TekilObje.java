package singleton;

public class TekilObje {
	
	
	public static TekilObje t = new TekilObje();
	public int sayac;
	
	private TekilObje() {
		sayac = 0;
		
	}
	
	public static TekilObje getInstance() {
		return t;
	}

}
