package oops.tns.constuctor;

public class Customer1 {
	private int customerId;
	private String customerName;
	private String customerCity;
	public Customer1()
	{
		System.out.println("Default constuctor");
	}
	public Customer1(int customerId,String customerName,String customerCity)
	{
		System.out.println("parameterised constuctor");
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerCity=customerCity;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer1 [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getCustomerCity()=" + getCustomerCity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}}
	