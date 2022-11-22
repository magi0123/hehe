package Zadaci01;

public class Glavna {

	public static void main(String[] args) {
		KalkulatorZaCeliBroevi k = new KalkulatorZaCeliBroevi();
		int x = 5;
		int y = 2;
		System.out.println("x-y=" + k.odzemanje(x, y));
		System.out.println("x+y=" + k.sobiranje(x, y));
		System.out.println("x*y=" + k.mnozenje(x, y));
		System.out.println("x/y=" + k.delenje(x, y));
		System.out.println("x%y=" + k.ostatok(x, y));
		System.out.println("x^y=" + k.stepenuvanje(x, y));

	}

}
