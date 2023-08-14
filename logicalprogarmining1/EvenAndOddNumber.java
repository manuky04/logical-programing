package logicalprogarmining1;

public class EvenAndOddNumber {
	public static void main(String []args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		for(int value:a) {
			if(value%2==0)
				System.out.println(value);
		}
		for(int value:a) {
			if(value%2!=0)
				System.out.println(value);
		}
	}

}
