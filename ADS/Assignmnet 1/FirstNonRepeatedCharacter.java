import java.util.*;
class FirstNonRepeatedCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		for(int i=0;i<arr.length;i++){
			arr[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] charCount = new int[256]; 
        
        for (char c : arr) {
            charCount[c]++;
        }
		
		for (char c : arr) {
            if (charCount[c] == 1) {
                System.out.println(c);
				break;
            }
        }
	}
}













/*char[] arr1 = new char[1];
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<=arr.length;j++){
				if(arr[i]!=arr[j]){
					arr1[0]=arr[i];
					//break;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));*/