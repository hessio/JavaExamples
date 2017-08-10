import java.util.Scanner;

class multipleArrays{
	public static void main(String[] args){
		String[] lastNames = {"Hanly", "Hession", "Scally", "Riordan", "McHale"};
		int[] idNums = {16347891, 12345621, 98765435, 12314153, 76543283};
		double[] GPA = {2.88, 4.13, 4.03, 3.67, 4.0};
		int IDnumber, counter;

		System.out.println("Values: ");
		for(counter = 0; counter < 5; counter++){
			System.out.println("\t" + lastNames[counter] + " " + idNums[counter] + " " +  GPA[counter]);
		}

		System.out.println(" ");
		System.out.println("ID number to find slot ");
		Scanner IDnumbers = new Scanner(System.in);
		IDnumber = IDnumbers.nextInt();
		System.out.println(" ");

		for(counter = 0; counter < 5; counter++){
			if(IDnumber == idNums[counter]){
				break; 
			}
		}

		for (counter = 0; counter < 5; counter++) {
			if(IDnumber == idNums[counter]){
				System.out.println("\t" + lastNames[counter]);
				System.out.println("\t" + idNums[counter]);
				System.out.println("\t" + GPA[counter]);
			}
		}
	}
}