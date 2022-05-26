package week4.day4;

public class Plandrome {


	public static void main(String[] args) {
		String name ="mam";
		String rev="";
		//char[]charArray=name.toCharArray();
		for(int i= name.length()-1;i>=0;i--) { 
		rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			
		System.out.println("Plandrome");
		}else {
				System.out.println("not palindrome");}
			
}
	}
