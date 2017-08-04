import java.util.Scanner;
class ageInFiveYears{
	public static void main(String[] args){
		int ageVariable, ageVariableLessFive, ageVariablePlusFive, placeHolder;
		String name;

		
		System.out.print("Please enter your name here: ");
		Scanner userName = new Scanner(System.in);
		name = userName.nextLine();
		System.out.println("Welcome " + name);

		System.out.println("Please enter your age here: ");
		Scanner userAge = new Scanner(System.in);
		placeHolder = userAge.nextInt();
		ageVariableLessFive = placeHolder - 5;
		ageVariablePlusFive = placeHolder + 5;

		System.out.println("Imagine " + name + " you were " + ageVariableLessFive + " five years ago and in 5 years you will be " + ageVariablePlusFive);
	}
}