package Zadaci02;

public class KalkulatorZaDecimalniBroevi implements IMatematickiOperaciiVrzDecimalniBroevi {
	public double odzemanje(double x, double y) {
		return x - y;
	}

	public double sobiranje(double x, double y) {
		return x + y;
	}

	public double mnozenje(double x, double y) {
		return x * y;
	}

	public double delenje(double x, double y) {
		return x / y;
	}

	public double ostatok(double x, double y) {
		return x % y;
	}

	public double stepenuvanje(double x, double y) {
		return Math.pow(x, y);
	}

}
