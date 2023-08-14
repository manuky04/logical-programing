package logicalprogarmining1;

public class maxElements {
	public static void main(String[] args) {
		
		int a[]= {12,34,5,5,56};
		
		int max=a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
