
public class AssignmentQuestion6 {

	public static void main(String[] args) {
		// double discount;
		double discountEvery = 0.5; // 50% of 100
		double discount5 = 0.05; // 5% of 100
		double discount10 = 0.10; // 10% of 100
		double discount20 = 0.20; // 20% of 100

		// Change the Promo to TRUE if needs to be applied and change the productPrice
		int productPrice = 100;
		boolean promo5 = false;
		boolean promo10 = true;
		boolean promo20 = false;

		// Always true; 50% discount on all products
		System.out.println("50% discount on all products, so you will get a discount of: " + "$"
				+ (discountEvery * productPrice));

		if (promo5) {
			System.out.println("Additional Promo5 is applied, so the price is: " + "$"
					+ (productPrice - (productPrice * (discount5 + discountEvery))));
		} else if (promo10) {
			System.out.println("Additional Promo10 is applied, so the price is: " + "$"
					+ (productPrice - (productPrice * (discount10 + discountEvery))));
		} else if (promo20) {
			System.out.println("Additional Promo20 is applied, so the price is: " + "$"
					+ (productPrice - (productPrice * (discount20 + discountEvery))));
		}

		else {
			System.out.println("Additional Promo didn't apply. Please try again");
		}

	}

}
