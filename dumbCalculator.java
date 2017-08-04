import java.util.Scanner;
class dumbCalculator{
	public static void main(String[] args){

		double firstNum, secondNum, thirdNum, answerNum1, answerNum;

		System.out.print("What is your first number? ");
		Scanner firstScannerNum = new Scanner(System.in);
		firstNum = firstScannerNum.nextDouble();

		System.out.print("What is your second number? ");
		Scanner secondScannerNum = new Scanner(System.in);
		secondNum = secondScannerNum.nextDouble();

		System.out.print("What is your third number? ");
		Scanner thirdScannerNum = new Scanner(System.in);
		thirdNum = thirdScannerNum.nextDouble();

		answerNum1 = firstNum + secondNum + thirdNum;

		answerNum = answerNum1/2;

		System.out.print(answerNum);
	}
}