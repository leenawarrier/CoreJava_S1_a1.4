//Prints the ASCII to alpha for code from 65 to 90, no user input
public class asciiToAlpha {
	public static void main(String args[]) {
		int j=90;
		System.out.println("ASCII from 65 to 90 is as follows :");
		// for loop to print values from 65 to 90
		for(j=65;j<91;j++) {
			// the (char) convers the int to it ASCII code
			System.out.println(j+"-"+(char)j);
		}
    }
	
}