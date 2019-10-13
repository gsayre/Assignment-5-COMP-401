package a5;

abstract public class IngredientImpl implements Ingredient {
	
	// variables
	private String name;
	private double pricePerOunce;
	private int calPerOunce;
	private boolean isVegetarian;
	private boolean isRice;
	private boolean isShellfish;

	// constructor
	public IngredientImpl(String name, double pricePerOunce, int calPerOunce, boolean isVegetarian, boolean isRice, boolean isShellfish) {
		this.name = name;
		this.pricePerOunce = pricePerOunce;
		this.calPerOunce = calPerOunce;
		this.isVegetarian = isVegetarian;
		this.isRice = isRice;
		this.isShellfish = isShellfish;
	}
	
	// method implementation
	public String getName() {
		return name;
	}
	public double getCaloriesPerDollar() {
		return calPerOunce/pricePerOunce;
	}
	public int getCaloriesPerOunce() {
		return calPerOunce;
	}
	public double getPricePerOunce() {
		return pricePerOunce;
	}
	
	public boolean getIsVegetarian() {
		return isVegetarian;
	}
	public boolean equals(Ingredient other) {
		if (other.getName().equals(this.name)) {
			if(other.getCaloriesPerOunce() == this.calPerOunce) {
				if (Math.abs(this.pricePerOunce - other.getPricePerOunce()) < 0.001) {
					if (other.getIsVegetarian() == this.isVegetarian) {
						if (other.getIsRice() == this.isRice) {
							if (other.getIsShellfish() == this.isShellfish) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	public boolean getIsRice() {
		return isRice;
	}
	public boolean getIsShellfish() {
		return isShellfish;
	}
}
