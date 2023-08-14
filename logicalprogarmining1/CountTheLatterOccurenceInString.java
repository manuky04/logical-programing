package logicalprogarmining1;
// count the letter Occurrence in String
public class CountTheLatterOccurenceInString {
	public static void main(String []args) {
		
String str="Mantu kumar Pandit";
    int l1=str.length();
    str=str.replaceAll("a","");
    int l2=str.length();
    System.out.println(l1-l2);
	}

}
