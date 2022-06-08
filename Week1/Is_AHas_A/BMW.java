package Is_AHas_A;

public class BMW extends Bike{
	private final String Model_No="BMW_1201";
	private int maxSpeed;
	public void setMaxSpeed(int speed) {
		maxSpeed=speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public String getModelNo() {
		return Model_No;
	}
	public void numberOfGears() {
		NumOfGear numGear=new NumOfGear();
		numGear.setNumGears(5);
		System.out.println(numGear.getNumGears());
		
	}
	
	

}
