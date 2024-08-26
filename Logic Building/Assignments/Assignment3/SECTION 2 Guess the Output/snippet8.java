public class LoopIncrement {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			count = count + i++ - ++i;
		}
		System.out.println(count);
	}
}


//0+0-2=-2
//-2+1-3=-4
//-4+2-4=-6
//-6+3-5=[-8]



//0+0-2=-2
//-2+2-4=[-4]