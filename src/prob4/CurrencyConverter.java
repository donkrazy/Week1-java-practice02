package prob4;

import java.util.Scanner;

public class CurrencyConverter {

	private static double RATE = 1282;

	public static double toDollar(double won) {
		return won/RATE;
	}

	public static double toKWR(double dollar) {
		return dollar*RATE;
	}

	public static void setRate(double r) {
		RATE = r;
	}

	public static void main(String[] args) {
		int input = 100;
		Scanner sc =new Scanner(System.in);
		double rate = (double) sc.nextInt();
		setRate(rate);
		System.out.println(Integer.toString(input) + "만 원은 " + Double.toString(10000*toDollar(input)) + "달러 입니다");
		System.out.println(Integer.toString(input) + "달러는  " + Double.toString(toKWR(input)) + "원 입니다");

	}
}
