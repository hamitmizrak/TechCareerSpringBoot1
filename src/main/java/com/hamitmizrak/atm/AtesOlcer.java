package com.hamitmizrak.atm;

public final class AtesOlcer {

	// nesne değişkenlerimiz
	private int id;
	private double ates;

	// parametresiz constructor
	public AtesOlcer() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constrctor
	public AtesOlcer(int id, double ates) {
		super();
		this.id = id;
		this.ates = ates;
	}

	public AtesOlcer(double ates) {
		this.ates = ates;
	}

//toString
	@Override
	public String toString() {
		return "AtesOlcer [id=" + id + ", ates=" + ates + "]";
	}

	// Method
	public boolean atesOlcumu(double deger) {
		if (deger <= 36.5) {
			return true;
		} else {
			return false;
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAtes() {
		return ates;
	}

	public void setAtes(double ates) {
		this.ates = ates;
	}

	// test
	public static void main(String[] args) {
		AtesOlcer atesClass = new AtesOlcer();
		atesClass.atesOlcumu(25);
	}

}
