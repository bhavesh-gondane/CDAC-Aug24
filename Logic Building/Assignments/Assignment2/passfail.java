class passfail{
	public static void main(String[] args){
		int m1_marks=41;
		int m2_marks=40;
		int m3_marks=21;
		
		int fail=0;
		
		if(m1_marks <= 40){
			fail++;
		}
        if(m2_marks <= 40){
			fail++;
		}
        if(m3_marks <= 40){
			fail++;
		}
		
		switch (fail) {
            case 0:
                System.out.println("Student passed in all subjects");
                break;
            default:
                System.out.println("no. of subjects student failed in: " + fail);
                break;
        }
	}
}