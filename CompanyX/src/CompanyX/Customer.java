package CompanyX;

public class Customer {
	private int orderNum; // order number
	private String name; // name of the person
	private String orderType; // bulk, rush, no priorty, favor 0 is for no priorty
	private int processingTime; // time in days
	private int priorty; // used this in processing class
	
	// here are some setters and getters

	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getProcessingTime() {
		return processingTime;
	}
	public void setProcessingTime(int processingTime) {
		this.processingTime = processingTime;
	}
	public int getPriorty() {
		return priorty;
	}
	public void setPriorty(int priorty) {
		this.priorty = priorty;
	}
	// here is a contrustor for the values and stuff
	public Customer(int orderNum, String name, String orderType, int processingTime) {
		//super();
		this.orderNum = orderNum;
		this.name = name;
		this.orderType = orderType;
		this.processingTime = processingTime;
		//this.priorty = priorty;
	}

	
	

}
