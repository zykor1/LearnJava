abstract class Light{
	int noOfWatts;
	boolean indicator;
	String location;

	public void switchOn(){
		indicator = true;
	}

	public void switchOff(){
		indicator = false;
	}

	public boolean isOn(){
		return indicator;
	}

	abstract public double kwhPrice();
}