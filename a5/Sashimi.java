package a5;

public class Sashimi implements Sushi {
	
	public enum SashimiType {TUNA, SALMON, EEL, CRAB, SHRIMP};
	SashimiType type;
	final double SashimiPortion = 0.75; 
	private IngredientPortion SushType;

	

	public Sashimi(SashimiType type) {
		this.type = type;
	}

	@Override
	public String getName() {
		return type.toString() + " " + this.toString();
	}

	@Override
	public IngredientPortion[] getIngredients() {
		IngredientPortion[] Ingredients = new IngredientPortion[1];
		if (type.equals(SashimiType.TUNA) ) {
			SushType = new TunaPortion(SashimiPortion);
			Ingredients[0] = SushType;
			return Ingredients;
		}else if (type.equals(SashimiType.SALMON)) {
			SushType = new SalmonPortion(SashimiPortion);
			Ingredients[0] = SushType;
			return Ingredients;
		}else if (type.equals(SashimiType.EEL)) {
			SushType = new EelPortion(SashimiPortion);
			Ingredients[0] = SushType;
			return Ingredients;
		} else if (type.equals(SashimiType.CRAB)) {
			SushType = new CrabPortion(SashimiPortion);
			Ingredients[0] = SushType;
			return Ingredients;
		} else {
			SushType = new ShrimpPortion(SashimiPortion);
			Ingredients[0] = SushType;
			return Ingredients;
		}
	}

	@Override
	public int getCalories() {
		if (type.equals(SashimiType.TUNA) ) {
			SushType = new TunaPortion(SashimiPortion);
			return (int) (SushType.getCalories() + 0.5);
		}else if (type.equals(SashimiType.SALMON)) {
			SushType = new SalmonPortion(SashimiPortion);
			return (int) (SushType.getCalories() + 0.5);
		}else if (type.equals(SashimiType.EEL)) {
			SushType = new EelPortion(SashimiPortion);
			return (int) (SushType.getCalories() + 0.5);
		} else if (type.equals(SashimiType.CRAB)) {
			SushType = new CrabPortion(SashimiPortion);
			return (int) (SushType.getCalories() + 0.5);
		} else {
			SushType = new ShrimpPortion(SashimiPortion);
			return (int) (SushType.getCalories() + 0.5);
		}
	}

	@Override
	public double getCost() {
		if (type.equals(SashimiType.TUNA) ) {
			SushType = new TunaPortion(SashimiPortion);
			return  ((int) ((SushType.getCost() * 100.0) +0.5)) / 100.0;
		}else if (type.equals(SashimiType.SALMON)) {
			SushType = new SalmonPortion(SashimiPortion);
			return ((int) ((SushType.getCost() * 100.0) +0.5)) / 100.0;
		}else if (type.equals(SashimiType.EEL)) {
			SushType = new EelPortion(SashimiPortion);
			return ((int) ((SushType.getCost() * 100.0) +0.5)) / 100.0;
		} else if (type.equals(SashimiType.CRAB)) {
			SushType = new CrabPortion(SashimiPortion);
			return ((int) ((SushType.getCost() * 100.0) +0.5)) / 100.0;
		}  else {
			SushType = new ShrimpPortion(SashimiPortion);
			return ((int) ((SushType.getCost() * 100.0) +0.5)) / 100.0;
		}
	}

	@Override
	public boolean getHasRice() {
		if (type.equals(SashimiType.TUNA) ) {
			SushType = new TunaPortion(SashimiPortion);
			return SushType.getIsRice();
		}else if (type.equals(SashimiType.SALMON)) {
			SushType = new SalmonPortion(SashimiPortion);
			return SushType.getIsRice();
		}else if (type.equals(SashimiType.EEL)) {
			SushType = new EelPortion(SashimiPortion);
			return SushType.getIsRice();
		} else if (type.equals(SashimiType.CRAB)) {
			SushType = new CrabPortion(SashimiPortion);
			return SushType.getIsRice();
		}  else {
			SushType = new ShrimpPortion(SashimiPortion);
			return SushType.getIsRice();
		}
	}

	@Override
	public boolean getHasShellfish() {
		if (type.equals(SashimiType.TUNA) ) {
			SushType = new TunaPortion(SashimiPortion);
			return SushType.getIsShellfish();
		}else if (type.equals(SashimiType.SALMON)) {
			SushType = new SalmonPortion(SashimiPortion);
			return SushType.getIsShellfish();
		}else if (type.equals(SashimiType.EEL)) {
			SushType = new EelPortion(SashimiPortion);
			return SushType.getIsShellfish();
		} else if (type.equals(SashimiType.CRAB)) {
			SushType = new CrabPortion(SashimiPortion);
			return SushType.getIsShellfish();
		}  else {
			SushType = new ShrimpPortion(SashimiPortion);
			return SushType.getIsShellfish();
		}
	}

	@Override
	public boolean getIsVegetarian() {
		if (type.equals(SashimiType.TUNA) ) {
			SushType = new TunaPortion(SashimiPortion);
			return SushType.getIsVegetarian();
		}else if (type.equals(SashimiType.SALMON)) {
			SushType = new SalmonPortion(SashimiPortion);
			return SushType.getIsVegetarian();
		}else if (type.equals(SashimiType.EEL)) {
			SushType = new EelPortion(SashimiPortion);
			return SushType.getIsVegetarian();
		} else if (type.equals(SashimiType.CRAB)) {
			SushType = new CrabPortion(SashimiPortion);
			return SushType.getIsVegetarian();
		}  else {
			SushType = new ShrimpPortion(SashimiPortion);
			return SushType.getIsVegetarian();
		}
	}

}
