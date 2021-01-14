package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = growthRate*2;
		double total = (population*growthRate)*bonus;
		System.out.println(total);
		return total;
	}

}
