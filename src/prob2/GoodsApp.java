package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			String name = sc.next();
			int price = Integer.parseInt(sc.next());
			int n = Integer.parseInt(sc.next());
			Goods good = new Goods(name, price, n);
			good.get();
		}


	}
}
