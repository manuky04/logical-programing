package logicalprogarmining1;

import java.util.Arrays;

public class checkToArraysAreEquals {
	public static void main(String[] args) {
		
		
		int [] arr= {1,2,3,4,5};
		int [] arr1= {1,2,3,4,5};
//		boolean status=Arrays.equals(arr,arr1);
//		if(status==true) {
//			System.out.println("are equal");
//		}else{
//			System.out.println("are not equal");
		if(Arrays.equals(arr, arr1)) {
			System.out.println("are equal");
			
		}else {
			System.out.println("are not equal");
		}
	}

}
