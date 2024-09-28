import java.util.*;
class Repeated{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the string");
		String str = sc.nextLine();
		//int count=0;
		char[] arr = new char[str.length()];
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			arr[i]=ch;
		}
		System.out.println(Arrays.toString(arr));//[p, r, o, g, r, a, m, m, i, n, g]
		char[] arr1 = new char[str.length()];
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr1[i]=arr[i];
				}
			}
				
			}
			System.out.println(Arrays.toString(arr1));	
		}
		
	}
//arr1[i]=arr[i];