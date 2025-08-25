package ch07;

public class CoinDemo {

	public static void main(String[] args) {
		System.out.println("DIME은" + Coin.DIME);
	}

}

interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}
