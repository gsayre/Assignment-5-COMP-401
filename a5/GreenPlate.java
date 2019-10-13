package a5;

public class GreenPlate extends PlateImpl {

	public GreenPlate(Sushi contents) throws PlatePriceException {
		super(contents, 2.0, Plate.Color.GREEN);
	}
}
