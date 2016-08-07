package pkSkills;

public class ClassCode{

	public static void main(String args[]){

		GuessGame game = new GuessGame();
		game.startGame();
	}
}

class GuessGame{

	Player p1;
	
	int targetNumber=0;
	

	public void startGame(){

		p1 = new Player();
	
		int guessOne=0;
		int noOfGuesses=0;
		boolean p1List=false;
		targetNumber = (int)(Math.random() *10);
		System.out.println("The number to guess is :" +targetNumber +"\n");		

		while(true){	

			p1.guess();	
			
			noOfGuesses=p1.counter;

			guessOne=p1.number;

			System.out.println("Please guess a Number : " +guessOne);

			if(targetNumber==guessOne){
				p1List=true;
			}

			if(p1List){
				System.out.println("Superb Guess!!! Your Guess is correct");
				System.out.println("Game Over Dear");
				System.out.println("Total Number of Guesses :" +noOfGuesses);
				break;

			}
			else{

				System.out.println("This is not the correct guess.");
				System.out.println("Please guess again \n");
			}
		}
	}
}
class Player{

	int number=0;
	
	int counter;

	public void guess(){

		number=(int) (Math.random() *10);
		counter++;

	}

}



