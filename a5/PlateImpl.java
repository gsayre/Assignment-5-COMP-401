package a5;

abstract public class PlateImpl implements Plate {
	private Sushi contents;
	private double price;
	private Plate.Color color;
	
	public PlateImpl(double price, Plate.Color color) {
		contents = null;
		this.price = price;
		this.color = color;
	}
	public PlateImpl (Sushi contents, double price, Plate.Color color) throws PlatePriceException {
		setContents(contents);
		this.price = price;
		this.color = color;
	}

	@Override
	public Sushi getContents() {
		return contents;
	}
	
	@Override
	public Sushi removeContents() {
		Sushi cont = contents;
		if (hasContents()) {
			contents = null;
			return cont;
		} else {
			return null;
		}
	}

	@Override
	public void setContents(Sushi s) throws PlatePriceException {
		if (s == null) {
			throw new IllegalArgumentException();
		}
		if (getPrice() < s.getCost()) {
			throw new PlatePriceException();
		}
		contents = s;
	}
	
	@Override
	public boolean hasContents() {
		return (!(contents == null));
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public double getProfit() {
		if (!hasContents()) {
			return 0.0;
		} else {
			return getPrice() - contents.getCost();
		}	
	}

}
