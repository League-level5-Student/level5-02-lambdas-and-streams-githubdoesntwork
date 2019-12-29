package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		String a = "The String";
		printCustomMessage(s -> {
			String b = "";
			for (int i = 0; i < a.length(); i++) {
				b = b + a.charAt(a.length() - i - 1);
			}
			System.out.println(b);
		}, a);
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage(s -> {
			String b = "";
			for (int i = 0; i < a.length(); i++) {
				char temp;
				if(i%2==0) {
					temp=Character.toLowerCase(a.charAt(i));
				}else {
					temp=Character.toUpperCase(a.charAt(i));
				}
				b=b+temp;
			}
			System.out.println(b);
		}, a);
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage(s->{
			String b="";
			for (int i = 0; i < a.length(); i++) {
				b=b+a.charAt(i)+".";
			}
			System.out.println(b);
		}, a);
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels
		char[] vowels= {'a','e','i','o','u','y'};
		printCustomMessage(s->{
			String b="";
			boolean isTrue=true;
			for (int i = 0; i < a.length(); i++) {
				isTrue=true;
				for (int j = 0; j < vowels.length; j++) {
					if(a.charAt(i)==vowels[j]) {
						isTrue=false;
					}
				}
				if(isTrue) {
					b=b+a.charAt(i);
				}
			}
			System.out.println(b);
		}, a);
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
