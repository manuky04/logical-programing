package logicalprogarmining1;

import java.util.Arrays;

public class TwoarraysIsEqualorNot {
	public static void main(String []args) {
	int a[]= {1,2,3,4,5,6,};
	int a1[]= {1,2,3,4,5,6};
	boolean status=Arrays.equals(a,a1 );
	if(status==true) {
		System.out.println(" arrays are equals");
	}else {
		System.out.println("arrays are not equals");
	}
	
	}
	

}
