package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = population*0.50;
		double total = (population*growthRate)+bonus;
		System.out.println(total);
		return total;
	}

}
