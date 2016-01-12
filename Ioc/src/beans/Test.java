package beans;

public class Test {
	
	private Car car;
	private String gender;
	private String name;
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void displayData(){
		System.out.println(gender+""+name);
		System.out.println("CarName : " + car.getCarname());
		System.out.println("Year : " + car.getYear());
	}
}
