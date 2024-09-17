package assignment5_sandeep_sir;

class InstanceCounter{
	private static int count;
	
	public InstanceCounter() {
		InstanceCounter.count=InstanceCounter.count+1;
	}
	
	public static int getCount() {
		return count;
	}
	
}

public class InstanceCounter1 {
	public static void main(String[] args) {
		InstanceCounter ic = new InstanceCounter();
		InstanceCounter ic1 = new InstanceCounter();
		InstanceCounter ic2 = new InstanceCounter();
		
		System.out.println("Instance count are: "+InstanceCounter.getCount());
	}
}
