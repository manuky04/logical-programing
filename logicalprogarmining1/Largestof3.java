package logicalprogarmining1;

public class Largestof3 {
	public static void main(String[] args) {
		
		int a=12, b=23,c=5;
		int l1=(a>b)? a:b;
		int l2=(a>c)? a:c;
		 int largest=(l1>l2)? l1:l2;
		 System.out.println(largest);
	}

}
