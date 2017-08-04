import java.util.Random;
import java.util.Scanner;

class projectBlackJack{
	public static void main(String[] args){
		//The random number generator function
		Random randCard = new Random();
		//variables declared here. Some initialised to zero so the while loop will work on the first go
		int firstPlayerCard, secondPlayerCard, firstDealerCard, anotherDealerCard = 0, dealerHiddenCard, dealerPlaceHolder, anotherPlayerCard;
		String userResponse;

		//The random numbers are given to the cards that don't change values here. Regardless of the number of iterations their value doesn't change
		firstPlayerCard = randCard.nextInt(9) + 2;
		secondPlayerCard = randCard.nextInt(9) + 2;
		dealerHiddenCard = randCard.nextInt(9) + 2;
		firstDealerCard = randCard.nextInt(9) + 2;

		//Welcome messages. Displayed once the game begins (Only once they are displayed)
		System.out.println("Welcome to Patrick's Black Jack game!");
		System.out.println("Player's cards are: " + firstPlayerCard + " and " + secondPlayerCard);
		System.out.println("The dealer has a " + firstDealerCard + " and their other card is hidden");
		globalVariables.playerTotal = firstPlayerCard + secondPlayerCard;
		System.out.println("Your total: " + globalVariables.playerTotal);
		globalVariables.dealerTotal = firstDealerCard + dealerHiddenCard;

		//This while loop is to allow the game to continue until either the dealer or player reaches a value greater than 21. Then the game is terminated
		while((globalVariables.playerTotal < 21) && (globalVariables.dealerTotal < 21)){

			//Asks the player what they want to do. Then converts their response to a string
			System.out.println("Would the Player like to hit or stay? ");
			Scanner userInput = new Scanner(System.in);
			userResponse = userInput.nextLine();

			if(userResponse.equalsIgnoreCase("check")){
				System.out.println("The dealer Total: " + globalVariables.dealerTotal + " the pleyer Total: " + globalVariables.playerTotal);
				break;
			}else{
				//Checks that the user's response is the correct value
				while(!((userResponse.equalsIgnoreCase("stay")) || (userResponse.equalsIgnoreCase("hit")))) {
					System.out.println("Please enter either 'stay' or 'hit' (Not case sensitive)!!");
					System.out.println("Would the Player like to hit of stay? ");
					Scanner userInput1 = new Scanner(System.in);
					userResponse = userInput1.nextLine();
				}
				//The userResponse variable is now either 'hit' or 'stay'!

				//If the player wants to hit, a random card is added to their total.
				if(userResponse.equalsIgnoreCase("hit")){
					anotherPlayerCard = randCard.nextInt(9) + 2;
					globalVariables.playerTotal += anotherPlayerCard;
					System.out.println("Your new total is: " + globalVariables.playerTotal);
				}

				if(globalVariables.dealerTotal <= 16){
					System.out.println("Dealer hits!");
					anotherDealerCard = randCard.nextInt(9) + 2;
					globalVariables.dealerTotal += anotherDealerCard;
					System.out.println("The dealer's new total is: " + globalVariables.dealerTotal);
				}
				else{
					System.out.println("Dealer stays!!");
					System.out.println("Dealer's hidden card was " + dealerHiddenCard);
					System.out.println("Dealer total is now: " + globalVariables.dealerTotal);		
				}
			}
		}

		if(globalVariables.playerTotal > 21){
			System.out.println("Dealer wins!!");
		}else if((globalVariables.playerTotal <= 21) && (globalVariables.playerTotal > globalVariables.dealerTotal)){
			System.out.println("PLayer wins!!");
		}else if((globalVariables.dealerTotal <= 21) && (globalVariables.dealerTotal > globalVariables.playerTotal)){
			System.out.println("Dealer wins!!");
		}else if(globalVariables.dealerTotal == globalVariables.playerTotal){
			System.out.println("Dealer wins!!");
		}else if(globalVariables.dealerTotal > 21){
			System.out.println("Player wins!!");
		}
	}
}