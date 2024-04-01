package tns.com.Abstraction;

public  class Jio extends Sim {
	private long mobNo;
	Jio(long mobNo)
	{
		this.mobNo=mobNo;
	}
	@Override
	public String toString() {
		return "Jio [mobNo=" + mobNo + "]";
	}
	@Override
	void call() {
		// TODO Auto-generated method stub
		
	}

}
