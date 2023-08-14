package logicalprogarmining1;
// Duplicate word in Array not Ok programming

public class DublicatewordinArrays {
	public static void main(String[] args) {
		
		
		String[]str= {"java","c","pythan","c"};
		for(int i=1; i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
			if(str[i].toLowerCase().equals(str[i].toLowerCase())) {
				
				System.out.println(str[i]);
			}
		}
	}

}
}