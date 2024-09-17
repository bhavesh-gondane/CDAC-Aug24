package assignment5_dt4_12_9_shweta_maam;
/*4)	Build a class Student which contains details about the Student and compile and run its
instance.
 * */

class Student{
	private int prn;
	private String name;
	private double cgpa;
	private String city;
	
	public Student() {
		this.prn = prn;
		this.name = name;
		this.cgpa = cgpa;
		this.city = city;
	}

	public int getPRN() {
		return prn;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public String getCity() {
		return city;
	}

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "PRN:"+prn+" Name:"+name+" CGPA:"+cgpa+" City:"+city;
	}
}
public class que4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Bhavesh");
		s.setPrn(123);
		s.setCgpa(3.21);
		s.setCity("Nagpur");
		System.out.println(s.getName());
	}
}











//123,"Bhavesh",8.07,"Nagpur"