class discount{
	public static void main(String[] args){
		int tpa=1000;
		double dis;
		char mem='n';
		if(tpa>=1000){
			if(mem=='y'){
				dis=0.25*tpa;
				System.out.println("Discout is: "+dis);
			}
			else{
				dis=0.20*tpa;
				System.out.println("Discout is: "+dis);
			}
		}
		else if(tpa>=500 && tpa<=999){
			if(mem=='y'){
				dis=0.15*tpa;
				System.out.println("Discout is: "+dis);
			}
			else{
				dis=0.1*tpa;
				System.out.println("Discout is: "+dis);
			}
		}
		else{
			if(mem=='y'){
				dis=0.1*tpa;
				System.out.println("Discout is: "+dis);
			}
			else{
				dis=0.5*tpa;
				System.out.println("Discout is: "+dis);
			}
		}
	}
}
