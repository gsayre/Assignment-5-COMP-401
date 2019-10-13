package a5;

public class GoldPlate extends PlateImpl {
	
	private static Sushi cont;

	public GoldPlate(Sushi contents, double price, Sushi cont) throws PlatePriceException {
		super (contents, priceTest(price), Plate.Color.GOLD);
		this.cont = cont;
	}
	
	private static double priceTest(double price) throws PlatePriceException {
		if (cont.getCost() > price ) {
			throw new PlatePriceException();
		}
		if (price < 5.0) {
			throw new IllegalArgumentException();
		} else {
			return price;
		}
	}
}
