package a5;

public class Nigiri implements Sushi {

	public enum NigiriType {TUNA, SALMON, EEL, CRAB, SHRIMP};
	NigiriType type;
	final double MeatAmount = 0.75; 
	final double RiceAmount = 0.5;
	private IngredientPortion SushType;
	private IngredientPortion RiceType;
	
	public Nigiri(NigiriType type) {
		this.type = type;
	}
	
	@Override
	public String getName() {
		return type.toString() + " " + this.toString();
	}

	@Override
	public IngredientPortion[] getIngredients() {
		IngredientPortion[] Ingredients = new IngredientPortion[2];
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			return Ingredients;
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			return Ingredients;
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			Ingredients[0] = RiceType;
			SushType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			return Ingredients;
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			return Ingredients;
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			return Ingredients;
		}
	}

	@Override
	public int getCalories() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  (int) ((SushType.getCalories() + RiceType.getCalories()) + 0.5);
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return (int) ((SushType.getCalories() + RiceType.getCalories()) + 0.5);
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return (int) ((SushType.getCalories() + RiceType.getCalories()) + 0.5);
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return (int) ((SushType.getCalories() + RiceType.getCalories()) + 0.5);
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return (int) ((SushType.getCalories() + RiceType.getCalories()) + 0.5);
		}
	}

	@Override
	public double getCost() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  ((int) (((SushType.getCost() + RiceType.getCost()) * 100.0) +0.5)) / 100.0;
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return ((int) (((SushType.getCost() + RiceType.getCost()) * 100.0) +0.5)) / 100.0;
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return ((int) (((SushType.getCost() + RiceType.getCost()) * 100.0) +0.5)) / 100.0;
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return ((int) (((SushType.getCost() + RiceType.getCost()) * 100.0) +0.5)) / 100.0;
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return ((int) (((SushType.getCost() + RiceType.getCost()) * 100.0) +0.5)) / 100.0;
		}
	}

	@Override
	public boolean getHasRice() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  SushType.getIsRice() || RiceType.getIsRice();
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		}
	}

	@Override
	public boolean getHasShellfish() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  SushType.getIsShellfish() || RiceType.getIsShellfish();
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		}
	}

	@Override
	public boolean getIsVegetarian() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		}
	}

}
