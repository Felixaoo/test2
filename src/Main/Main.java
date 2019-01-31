package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		int a = 9;
		int b = 18;
		System.out.println(calcul(a, b));
		String repJava =System.getenv("JAVA_HOME");
		System.out.println(repJava);
		String test = "aaabbbcddeefgg";
		System.out.println(inversionChaine(test));
		System.out.println("dff");

	}

	public static int calcul(int a, int b) {
		return a + b;
		
	}

	public static String inversionChaine(String text) {
		String recup = "";
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < text.length(); i++) {
			list.add(i, Character.toString(text.charAt(i)));
			
		}
		for (int i = 1; i < list.size() - 1; i++) {
			if (list.get(i).equals(list.get(i - 1)))
				recup += list.get(i);
		}
		return recup;
	}

}
