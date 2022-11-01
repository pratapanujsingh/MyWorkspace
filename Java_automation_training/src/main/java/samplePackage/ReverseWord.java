package samplePackage;

public class ReverseWord {

	
	public static void main(String[] args) {
		
		String s = " I live in India";
		String[] split = s.split(" ");
		//String result = "";
		
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
		//System.out.println(result.trim());
	}
}
