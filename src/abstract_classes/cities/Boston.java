package abstract_classes.cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double bsmoney = 0.50;
		return (bsmoney * population) + population * growthRate;
	}

}
