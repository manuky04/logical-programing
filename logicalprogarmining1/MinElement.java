package logicalprogarmining1;

public class MinElement {
	public static void main(String[] args) {
		
		int a[]= {1,23,2,45,67};
		int min=a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
