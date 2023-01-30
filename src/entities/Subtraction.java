package entities;

public class Subtraction extends Calculator {

	private Double value1;
	private Double value2;

	public Subtraction() {

	}

	public Subtraction(Double value1, Double value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public Double getValue1() {
		return value1;
	}

	public void setValue1(Double value1) {
		this.value1 = value1;
	}

	public Double getValue2() {
		return value2;
	}

	public void setValue2(Double value2) {
		this.value2 = value2;
	}

	@Override
	public Double calculations() {
		return value1 - value2;
	}
	
	public String toString() {
		StringBuilder stb = new StringBuilder();
		
		stb.append(value1 + " - " + value2 + " = " + calculations());

		return stb.toString();
	}


}
