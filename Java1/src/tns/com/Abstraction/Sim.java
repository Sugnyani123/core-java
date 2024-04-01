package tns.com.Abstraction;

public abstract class Sim {
	public String getSimName() {
		return simName;
	}
	public void setSimName(String simName) {
		this.simName = simName;
	}
	private String simName;
	abstract void call();
	void show() {
	System.out.println("You are calling from " +simName+ "sim ");
	System.out.println("Have a good day");
	}
	public Sim(String simName) {
		super();
		this.simName = simName;
	}
	public Sim() {
		super();
	}
			
}
