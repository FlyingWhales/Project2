package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		//TekilObje t = new TekilObje(); //çalışmaz
		
		System.out.println(TekilObje.getInstance().sayac);
		
		TekilObje.getInstance().sayac = 5;
		
		System.out.println(TekilObje.getInstance().sayac);

	}
}
