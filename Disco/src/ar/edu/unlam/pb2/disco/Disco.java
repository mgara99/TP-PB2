package ar.edu.unlam.pb2.disco;

public class Disco {

	private double radioInterior;
	private double radioExterior;
	private double perimetroInterior;
	private double perimetroExterior;
	private double superficie;

	public Disco(Integer radioI, Integer radioE) {

		radioInterior = radioI;
		radioExterior = radioE;

		perimetroInterior = radioI * 2 * 3.14;
		perimetroExterior = radioE * 2 * 3.14;

		superficie = 3.14 * (radioE * radioE - radioI * radioI);
	}

	
	public void cambiarElRadioInterior(Integer radioI) {
		this.radioInterior = radioI;
		this.perimetroInterior = radioI * 2 * 3.14;
		this.superficie = 3.14 * (this.radioExterior * this.radioExterior - radioI * radioI);

	}

	
	public void cambiarElRadioExterior(Integer radioE) {
		this.radioExterior = radioE;
		this.perimetroExterior = radioE * 2 * 3.14;
		this.superficie = 3.14 * (radioE * radioE - this.radioInterior * this.radioInterior);

	}
	public double mostrarRadioInterior() {
		return this.radioInterior;
	}
	public Integer mostrarRadioExterior() {
		return (int) this.radioExterior;
	}
}
